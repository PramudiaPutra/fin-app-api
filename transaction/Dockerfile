#jdk base image
FROM openjdk:17-slim

WORKDIR /app

COPY target/*.jar transaction.jar

ENTRYPOINT ["java","-jar","/app/transaction.jar"]
