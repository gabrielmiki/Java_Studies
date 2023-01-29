# Java Studies

## Java Frameworks
Java frameworks are bodies of prewritten code used by developers to create apps using the Java programming language. It’s a Java platform for developing software applications and Java programs. Java frameworks are bodies of reusable pre-written code acting as templates that developers can use to create applications by filling in custom code as needed. Java frameworks may include predefined classes (such as categories of objects) and functions that can be used to process, input, and manage hardware devices, as well as interact with system software.

### Library and Framework
A library is a certain function of an application; a framework is the app’s skeleton; and the API brings them both together for the user. A framework may include a library, compiler, and other programs used in the development process. With a good framework, a developer doesn’t have to bother with recurrent pieces of code used across a domain or application.

### Quarkus Framework
Is a full stack Java framework, where it is possible to build web applications, web services and standalone components. Quarkus is also Kubernetes native, it was designed to operate in a containerise world, and cloud native, many of its size, efficiency and extensions have the ability to run in many operational formats. 

#### Dependency Injection
Is a diferent way of dealing with constricts of control. Instead of you managing the state of the classes that are part of your application, you allow the container to manage it. When making use of a container in Quarkus wich manages some classes, if one of the classes needs a dependency with traditoinal dependency management you would create the object you need in your class, but instead we will define it so the container can create it. Than you allow the container to inject the class that needs to consume it.

#### Beans

#### Scoping a Bean

#### Context and Dependency Injection

### ConfigProperty
Core concept of the ability to add external configuration. It is an annotation to load a property from environment. Inside the resources folder in the application.properties is were we define all of our configuration porperties that live with the application.

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
 
#### Terminal Compilation
The command to compile a Quarkus-Maven project on the terminal is:
```
mvn compile quarkus:dev
```

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
- 
