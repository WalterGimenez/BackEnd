
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template

FROM alpine:latest

#FROM openjdk:8-jdk-alpine
COPY . /app
WORKDIR /app
RUN ./mvnw package
EXPOSE 8080
CMD ["java", "-jar", "target/my-app.jar"]

