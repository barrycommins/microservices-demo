# microservices-demo
Microservices Demo, which will include service discovery, distributed tracing, configuration management and circuit breakers.

Many of the concepts, and some of the code will come from here: https://github.com/kbastani/spring-cloud-event-sourcing-example , but there will be some different technology choices and possibly a different problem domain.

Currently only contains one service, Account Service which uses a MySQL database, but it not yet complete.

Docker support included through Spotify's Maven Docker Plugin, calling ```mvn clean install``` creates the Docker images.

```docker-compose up``` launches the services in Docker
