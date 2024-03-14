FROM openjdk:11

WORKDIR /srv

COPY ./tp-maven-docker-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "tp-maven-docker-0.0.1-SNAPSHOT.jar"]
