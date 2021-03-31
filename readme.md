## Service Locator Pattern

###Introduction  
This pattern uses the central repository of all the services available. It will return the service on request to perform necessary task.  

According to wikipedia  

``The service locator pattern is a design pattern used in software development to encapsulate the processes involved in obtaining a service with a strong abstraction layer. This pattern uses a central registry known as the "service locator", which on request returns the information necessary to perform a certain task
``
This will prepare all the required component available well in advance. So we can get the dependency as we need making the Dependency Injection (DI) little simpler. But there are arguments on Service locator pattern being a anti-pattern. That we will look in cons section.

###Benefits:
- Runtime linking of the classes   
- Large part of the application can be separated


###Cons
- Leads to runtime issues since we don't know if the object for the given dependecy is available or not  
- Difficult to test, we will need to mock all the injections

### ServiceLocator  
The ServiceLocator represents the registry where services are looked up and where information about services (known as Descriptors) are bound into the registry.  
Event the ServiceLocator class is also registered to the ServiceLocator.

ServiceLocator can be created by using ServiceLocatorFactory.
Basically ServiceLocator abstracts API lookup service and provides simple interface to clinets to get the required service.

###code organization
- nonlib -- implements the service locator without using hk2
- hk2 -- 

