FROM openjdk:17
EXPOSE 8081
ADD target/docker-integration.jar docker-integration.jar
ENTRYPOINT [ "java", "-jar","/docker-integration.jar" ]