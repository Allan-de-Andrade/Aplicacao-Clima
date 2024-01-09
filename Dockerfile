FROM openjdk:17-jdk-slim
WORKDIR /app
EXPOSE 8080
COPY target/Application_Climate-0.0.1-SNAPSHOT.jar /app/application_climate.jar
ENTRYPOINT ["java", "-jar","application_climate.jar"]