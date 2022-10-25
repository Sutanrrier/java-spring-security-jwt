FROM openjdk:8-jdk-alpine
ADD target/simple-jwt-0.0.1-SNAPSHOT.jar simplejwt.jar
ENTRYPOINT ["java", "-jar", "simplejwt.jar"]
