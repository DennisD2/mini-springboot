# Mini REST Spring Boot application with Spring REST
This application comes as a jar package.
It contains a minimal REST service.
The REST service is implemented using Spring Boot REST.

# Dependencies
The dependencies include some modules removed from JDK 9 onwards. 
I assume the application runs on JDK 1.8, 9 10, and 11.

Tested with JDK 11. 

# Call example

## REST service call

### Echo endpoint
http://localhost:8080/echo/199

# How to compile and package
mvn clean install -DskipTests

# How to run
java -jar target/mini-springboot-rest-1.0.0-SNAPSHOT.jar