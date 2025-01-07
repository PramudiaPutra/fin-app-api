#jdk base image
FROM openjdk:17-slim

WORKDIR /app

COPY target/*.jar wallet.jar

ENTRYPOINT ["java","-jar","/app/wallet.jar"]
