FROM openjdk:11
EXPOSE 9004
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} productpage-service.jar
ENTRYPOINT ["java","-jar","/productpage-service.jar"]