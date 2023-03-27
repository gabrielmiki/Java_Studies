# Java Studies

## Java Frameworks
Java frameworks are bodies of prewritten code used by developers to create apps using the Java programming language. It’s a Java platform for developing software applications and Java programs. Java frameworks are bodies of reusable pre-written code acting as templates that developers can use to create applications by filling in custom code as needed. Java frameworks may include predefined classes (such as categories of objects) and functions that can be used to process, input, and manage hardware devices, as well as interact with system software.

### Library and Framework
A library is a certain function of an application; a framework is the app’s skeleton; and the API brings them both together for the user. A framework may include a library, compiler, and other programs used in the development process. With a good framework, a developer doesn’t have to bother with recurrent pieces of code used across a domain or application.

### Quarkus Framework
Is a full stack Java framework, where it is possible to build web applications, web services and standalone components. Quarkus is also Kubernetes native, it was designed to operate in a containerise world, and cloud native, many of its size, efficiency and extensions have the ability to run in many operational formats. 

#### Dependency Injection
Is a diferent way of dealing with constricts of control. Instead of you managing the state of the classes that are part of your application, you allow the container to manage it. When making use of a container in Quarkus wich manages some classes, if one of the classes needs a dependency with traditoinal dependency management you would create the object you need in your class, but instead we will define it so the container can create it. Than you allow the container to inject the class that needs to consume it.
In an OOL a class owes its owns dependencies and is responsible for instatiation of those dependencies. With DI the container owns the objects and injects them in the classes as approprieate. Classes holds a reference to the object and the container injects it in. Do not need to deal with object initialization and instantiation.

##### ArC
Quarkus accomplishes injections with ArC. ArC is the CDI container. ArC Phases:
1. Initialization: much of the propertory work by the framework occurs in the context are created as well as register.
2. Bean Discovery: determine the instatiation order and properly inject them where they are needed.
3. Registration of Systhetic Components
4. Validation of the Deployment
 
#### Jakarta CDI Specification

#### Beans
Is a plane old Java Object, that has not only his attributes, but also it's methods. 

#### Scoping a Bean

#### Context and Dependency Injection

#### Injection
The property @ApplicationScoped defines a bean that we want to manage. An object that is defined as @ApplicationScoped is created once for the duration of the lifetime of the application.
 
#### Properties Injection
There is an annotation: @ConfigProperty, that is put over the attribute in your class and that will inject that property into your class variable.

#### ConfigProperty
Core concept of the ability to add external configuration. It is an annotation to load a property from environment. Inside the resources folder in the application.properties is were we define all of our configuration porperties that live with the application.

#### Running Quarkus in a Container 
Inside the docker folder in the quarkus framework there are some files. One of them is the Dockerfile.jmv that's been specifically written for a JVM environment. The image of is built as:
```
docker build -f src/main/docker/Dockerfile.jvm -t quarkus/hello-okd .
```
With this command the image is created and can be seen through the docker image ls command. To run it we use the docker run command.
There is also the possibility to run the native image inside a container. This is done due to the presence of another file inside the docker folder, the Dockerfile.native file. Before building the Docker image, package your application by including the -Dnative-image.docker-build option:
```
mvn package -Dnative -Dquarkus.native.container-build=true
```
Than we build the image:
```
docker build -f src/main/docker/Dockerfile.native -t quarkus/hello-okd-native .
```
#### Deploying an image in a Kind Kubernetes Cluster

##### Managging the Kind Clusters
In orther to run our application a cluster is necessary. To create a cluster in Kind we run the command:
```
kind create cluster --name first_application
```
To enumerate the clusters you have:
```
kind get clusters
```
If you want to interact with a specific cluster it is necessary to specify a context.
```
kubectl get pods --context first_application
```
To delete a cluster:
```
kind delete cluster --name first_application
```
By default, Kind creates the cluster with only one node, which acts as a control plane. If you want to create a multi-node cluster with additional worker nodes, or need three for high availability (HA), it is possible to set the enviroment through a YAML file. When configurating the file, in the nodes section, define the node role for each of the nodes. For example, the file below creates a two-node cluster with one control plane and one worker node:
```
kind: Cluster
apiVersion: kind.x-k8s.io/v1alpha4
nodes:
- role: control-plane
- role: worker
```
When creating the cluster, use the --config option to introduce the new cluster configuration:
```
kind create cluster --name nodes-test --config workerNodes.yaml
```

##### Kubernetes Manifests

##### Deployments
```
apiVersion: apps/v1
kind: Deployment
metadata:
  name: container-quarkus-deployment
  labels:
    app: container-quarkus
spec:
  replicas: 2
  selector:
    matchLabels:
      app: container-quarkus
  template:
    metadata:
      labels:
        app: container-quarkus
    spec:
      containers:
      - name: quarkus-app
        image: nginx:1.14.2
        ports:
        - containerPort: 80
```
- A Deployment named container-quarkus-deployment is created, indicated by the .metadata.name field.
- The .spec.selector field defines how the created ReplicaSet finds which Pods to manage. In this case, you select a label that is defined in the Pod template.
- The template field contains the following sub-fields:
  - The Pods are labeled app: container-quarkus using the .metadata.labels field.
  - The Pod template's specification, or .template.spec field, indicates that the Pods run one container, quarkus-app, which runs the ____ image at version _____.
The '.spec.template' and '.spec.selector' are the only required fields of the '.spec'. The '.spec.template' is a Pod template. It has exactly the same schema as a Pod, except it is nested and does not have an 'apiVersion' or 'kind'. In addition to required fields for a Pod, a Pod template in a Deployment must specify appropriate labels and an appropriate restart policy. For labels, make sure not to overlap with other controllers.
If a HorizontalPodAutoscaler (or any similar API for horizontal scaling) is managing scaling for a Deployment, don't set '.spec.replicas'. Instead, allow the Kubernetes control plane to manage the '.spec.replicas' field automatically.
'.spec.selector' is a required field that specifies a label selector for the Pods targeted by this Deployment. '.spec.selector' must match '.spec.template.metadata.labels', or it will be rejected by the API.
'.spec.strategy' specifies the strategy used to replace old Pods by new ones. '.spec.strategy.type' can be "Recreate" or "RollingUpdate". "RollingUpdate" is the default value. You can specify maxUnavailable and maxSurge to control the rolling update process. '.spec.strategy.rollingUpdate.maxUnavailable' is an optional field that specifies the maximum number of Pods that can be unavailable during the update process. '.spec.strategy.rollingUpdate.maxSurge' is an optional field that specifies the maximum number of Pods that can be created over the desired number of Pods.
'.spec.progressDeadlineSeconds' is an optional field that specifies the number of seconds you want to wait for your Deployment to progress before the system reports back that the Deployment has failed progressing - surfaced as a condition with 'type: Progressing', 'status: "False"'. and 'reason: ProgressDeadlineExceeded' in the status of the resource. The Deployment controller will keep retrying the Deployment. This defaults to 600. In the future, once automatic rollback will be implemented, the Deployment controller will roll back a Deployment as soon as it observes such a condition. If specified, this field needs to be greater than '.spec.minReadySeconds'



###### Usefull Commands
For larger numbers of resources, you'll find it easier to specify the selector (label query) specified using -l or --selector, to filter resources by their labels
If you happen to organize your resources across several subdirectories within a particular directory, you can recursively perform the operations on the subdirectories also, by specifying --recursive or -R alongside the --filename,-f flag.

###### Using labels effectively
Different applications would use different values for the app label, but a multi-tier application, such as the guestbook example, would additionally need to distinguish each tier. The labels allow us to slice and dice our resources along any dimension specified by a label 

##### Using a Local Docker Registry to Share images with the Cluster
To start a docker registry run the command:
```
docker run -d -p 5000:5000 --restart=always --name registry registry:2
```
To pull images to a local registry they need to be correctly tagged.
```
docker tag image_name localhost:5000/image_name
```
And pushed it.
```
docker push localhost:5000/image_name
```
To pull it, on the other hand, we do:
```
docker pull localhost:5000/image_name
```
The process to stop and remove the registry:
```
docker container stop registry && docker container rm -v registry
```

##### Using the Registry
After tagging and pushing the image from the host to the local registry, the image is available to use within the container.
```
kubectl create deployment image_name --image=localhost:5001/image_name
```


##### Quarkus

### Quarkus Features

#### The Test Class
Using JUnit as the REST Assured library is possible to test the REST aplication. A basic strucutre of the utilization of the library is:
```
@Test
public void test() {
 given()
  .pathParam("ex_param", "ex_param_value")
  .when().get("/path/{ex_param}")
  .then()
  .statusCode(200)
  .body(is("hello ex_param_value"));
}
```

#### Some Terminal Commands
Para criar um framework maven faz-se:
```
mvn io.quarkus:quarkus-maven-plugin:3.0.0.Alpha:Create \
-DprojectGroupId`=
-DprojectArtifactId=
-DclassName=
-Dpath=
``` 
The command to compile a Quarkus-Maven project on the terminal is:
```
mvn compile quarkus:dev
```
Para rodar os testes:
```
mvn clean test
```
In orther to turn the application into a native-image:
```
mvn package -Pnative
```
To run the tests on the native image:
```
mvn verify -Pnative
```

### Logging Frameworks
Quarkus supports many logging frameworks. JBoss Logging is the default Logging dafault. Logs are configured within application properties (quarkus.log.\*). These are basically outputs that we can flag.
```
private final Logger LOG = Logger.getLogger(CommandRunner.class);
...
LOG.debug("Starting Application");
```
```
quarkus.log.category."Challenge".level=DEBUG
```

### Data Access
Is based entirely on the concept of a datasource. All the configuration for that datasorce is managed by Quarkus through the applications.properties file. There are specific properties depending on the data base used. 

#### Agroal Extension
This is waht provides the datasource itself. It does the connection to the datasource. This extension along with a core driver (data base) is what is required to do data access with Quarkus. 

#### Configuring Datasources
In ort

#### Web-based Traffic

##### HTTP Basic
In Quarkus is an implementation of eclipse MicroProfile. As such HTTP traffic, specifically REST implementations, are based on JAX-RS. In Quarkus the framework haddles the serveled mapings. 

#### REST Client
This framework provides build in support for making RESTful web calls via the MicroProfile REST Client. The client henddles all the connection settings, setup and teardown. You can focus on just making the call and working with the data that you get back. 

#### RESTful Communications
REST is the communication standard for web services. JAX-RS is the REST interface.

##### JAX-RS
- @Path: Classes annotateted with @Path should response to web requests
  - Methods within those classes are directly annotated with the HTTP verb that they listened to. 
- @QueryParam are used for optional values for the request
- @PathParam are resolved in two parts: first the path will contain a variable within curly braces. Then, in the method signture, the variable is annotated with an @PathParam

##### Example Flow: 
When the web request comes in with the JSON, it gets unmarshalled into Java Objects and the Java objets are parsed into the methods itself. Then they get marshalled back into JSON and sent back out after the response comes.

#### Linux -> Windows
To get to my Windows user from Linux:
```
//mnt/c/Users/
```

### Java Aspects

#### Package
Packages are used for a better organization of the Java classes.

#### String Methods
Methods udes with strings:
- string1.equals(string2)
- string.startsWith(subString)
- string.substring(startIndex, endIndex)
- string.contains(subString)
- string.isEmpty()


### Monolithic 
A Monolithic Architecture is a complete, massive, and uniform piece of code. In other words the application is a single logical executable. To make any changes to the system, it is necessary to build and deply an update version of the whole server-side application. This configurations leads to higher risks to deploy new features, longer periods of time to test the system, problems in sacalability, dificulty in team communication, etc.

### Microsservices
Microssevices applications are composed of several descrete services, communicatig via API. They break down an app into a large number of small processes. Due to the way Docker function, this is a strong tool to implement microsservices. The fact that it provides the segmentation in lighter and practical manner improves deliverability, quality, and more. 
By definition a Microsservice Architecture (MSA) consists of a collection of loosely-coupled services. Each service, therefor, should be isolated and autonomous. 
When creating an application using microsservices architecture, each microsservice is responsible for a specific business function. These qualities allows a easier scalability, a mrore practical way of insert new features and fix problems, the formation of small and agile teams, etc.

### Microsservice and Data Consistency
Since every microsservice is responsible for its entire task, the necessity to store data in each of them is a reality. But due to this data spread a problem arises: the data consistency. 
An approach to such a problem is the publish/subscribe pattern, in wich the services that modifies or generate data allows other services to subscribe to events. The subscribed services receive the event saying that the data has been modified. 
Even though there is always the possibility to lose an event. Therefor it is healthy to admit that some changes will not propagate to the entire system directly, but, evenctually, the whole system will be consistent.

## REST Project
A Representational State Transfer (REST) is an architectural style and a design for network-based software. It describes how one system can communicate a state with another. REST is used to transport resources representations (JSON, HML, HTML) over the network. The stardart method used by REST architectures is the HTTP. A RESTful web service is simply a web service that is based on the REST resource concept and the usage of HTTP methods. 

## Bibliography

### Maven

#### Creating a project with Maven
```
mvn archetype:generate -DgroupId=edu.miki.mavencourse -DartifactID=conteudo -Darchetype=maven-archetype-quickstart -DinteractiveMode=false
```

#### Commun Commands
Compilation: compiles all the java classes in the project and insert them into the target folder.
```
mvn compile
```
Test: maven compiles the test classes.
```
mvn test
```
Pack the application: creates the .jar document of the application.
```
mvn package
```
Clean the project:
```
mvn clean
```

#### Creating diferent Projects
A new project type is set through the archetype parameter. 

#### Dependencies
POM: project object model, details the project and how to build the project. 
