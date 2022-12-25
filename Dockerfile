
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

#FROM openjdk:8-jdk-alpine
#COPY target/WG-0.0.1-SNAPSHOT.jar /app.jar
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","/app.jar"]
#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#COPY target/WG-0.0.1-SNAPSHOT.jar /app.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
#
# Build stage
#
FROM maven:3.8.2-jdk-11 AS build
COPY . .
RUN mvn clean package -Pprod -DskipTests

#
# Package stage
#
FROM openjdk:17-jdk-slim
COPY --from=build /WG-0.0.1-SNAPSHOT.jar /app.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]