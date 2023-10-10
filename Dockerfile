FROM openjdk:17
EXPOSE 8080
ADD target/schema-to-pojo-docker.jar schema-to-pojo-docker.jar
ENTRYPOINT ["java","-jar","/schema-to-pojo-docker.jar"]