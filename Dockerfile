FROM openjdk:11
ADD rest/target/rest-wit-java-challenge-docker.jar rest-wit-java-challenge-docker.jar
ENTRYPOINT ["java", "-jar", "rest-wit-java-challenge-docker.jar"]
EXPOSE 8080