# WIT Java Challenge
This is a Maven Java project built for a challenge proposed by WIT Software. It is a REST API with the basic functionalities of a calculator, divided in two modules that communicate using between themselves using RabbitMQ and Spring AMQP.

## Installation
### Pre-requisites
- JDK Installed
- Docker Installed

### Installing RabbitMQ
```bash
docker run -it -rm --name rabbitmq -p 5672:5672 -p 15672:15762 rabbitmq:3.9-management
```

### Creating a queue on RabbitMQ
Access the RabbitMQ Management page at
```bash
http://localhost:15672
```
with **guest** as the **username** and **password**.

Then create the queue named as <b>operations</b>.

## Run the application
Run the StartupApplication on your IDE

### Using the Rest Operations
Examples:
```bash
http://localhost:8080/sum?a=1&b=1
http://localhost:8080/subtract?a=1&b=1
http://localhost:8080/multiply?a=1&b=1
http://localhost:8080/divide?a=1&b=1
```
