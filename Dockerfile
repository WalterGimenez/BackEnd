
# Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
# Click nbfs://nbhost/SystemFileSystem/Templates/Other/Dockerfile to edit this template
#COPY . /app
#WORKDIR /app
#RUN ./mvnw package
#EXPOSE 8080
#CMD ["java", "-jar", "target/my-app.jar"]

#FROM alpine:latest
FROM amazoncorretto:17-alpine-jdk
MAINTAINER emaaristimuno
#COPY target/WG-0.0.1-SNAPSHOT.jar /app.jar
COPY /BackEnd/target/WG-0.0.1-SNAPSHOT.jar app.jar

#EXPOSE 8080
#CMD ["java", "-jar", "target/my-app.jar"]
ENTRYPOINT ["java", "-jar", "/app.jar"]

