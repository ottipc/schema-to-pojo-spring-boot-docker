# Spring Boot Json To POJO

## Instruction

1. Put schemas.json in _.../resources/schema_
2. use Maven Plugins **jsonschema2pojo:generate**
3. Pojos will be created in _../target/classes/com/devguy/jsonschematojava_ (configurable in pom.xml)

## Bauen

- mvn compile install
- sudo docker image rm -f c078eb8bd193
- sudo docker build -t schema-to-pojo-docker.jar .
- sudo docker image ls
- sudo docker run -p 9090:8080 schema-to-pojo-docker.jar


## Testaufruf

http://localhost:9090/message
