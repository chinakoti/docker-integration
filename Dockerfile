FROM openjdk:17
EXPOSE 8081
ADD target/docker-integration1.jar docker-integration1.jar
ENTRYPOINT [ "java", "-jar","/docker-integration1.jar" ]