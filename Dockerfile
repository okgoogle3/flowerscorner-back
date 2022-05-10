FROM openjdk:17-alpine
WORKDIR /tmp/server
COPY ./target/jjour-0.0.1-SNAPSHOT.jar server.jar
EXPOSE 8080

ENV DB_USERNAME root


ENTRYPOINT ["java", "-jar", "server.jar"]