# Java_Studies

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

## Bibliography
- 
