FROM openjdk:18-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
EXPOSE 8085
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]