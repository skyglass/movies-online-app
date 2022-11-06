FROM openjdk:17-jdk-slim

ENV APP_HOME /app/

COPY movies-api-0.0.1-SNAPSHOT.jar $APP_HOME

EXPOSE 8080

WORKDIR $APP_HOME

# set env variables when starting the container
CMD java -jar movies-online-0.0.1-SNAPSHOT.jar
