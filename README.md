# Mini REST Spring Boot application with Spring REST
This application comes as a jar package.
It contains a minimal REST service.
The REST service is implemented using Spring Boot REST.

The WAR file can be deployed in a Tomcat. 

# Dependecies
The dependencies include some modules removed from JDK 9 onwards. 
I assume the eapplication runs on JDK 1.8, 9 10, and 11.

Tested on Tomcat 9.0.13, JDK 11.

# Call example

## REST service call

### Echo endpoint
http://localhost:8080/mini/rest/echo/199
http://localhost:8080/echo?name=199

# How to compile and package
mvn clean install -DskipTests

# How to run
Copy war file from target directory into webapp of a tomcat installation.

