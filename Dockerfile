FROM openjdk:latest

LABEL MAINTAINER Rakesh

EXPOSE 9000:9090

COPY target/demo-0.0.1-SNAPSHOT.jar .

CMD java -jar demo-0.0.1-SNAPSHOT.jar