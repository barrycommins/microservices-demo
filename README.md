# microservices-demo
Microservices Demo, which will include service discovery, distributed tracing, configuration management and circuit breakers

Currently only contains one service, Account Service that does nothing but boot so far.

Docker support included through Spotify's Maven Docker Plugin, calling ```mvn clean install``` creates the Docker images.

```docker-compose up``` launches the services in Docker
