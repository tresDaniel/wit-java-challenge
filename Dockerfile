FROM openjdk:11
ADD rest/target/wit-java-challenge-docker.jar wit-java-challenge-docker.jar
ENTRYPOINT ["java", "-jar", "wit-java-challenge-docker"]
EXPOSE 8080