# microservices-demo
Microservices Demo, which will include service discovery, distributed tracing, configuration management and circuit breakers.

Many of the concepts, and some of the code will come from here: https://github.com/kbastani/spring-cloud-event-sourcing-example , but there will be some different technology choices and possibly a different problem domain.

Currently has:
 
* a Discovery Service (Eureka), 

* an Edge Service/Reverse Proxy (Zuul), 

* an Admin Service for monitoring (Spring Boot Admin) 

* A Microservices Dashboard for visualising connections between components

* and one domain service, Account, which has a MySQL database, but is incomplete.

Docker support included through Spotify's Maven Docker Plugin, calling ```mvn clean install``` creates the Docker images.

```docker-compose up``` launches the services in Docker
