# Spring Boot Json to Pojo


## Instruction

- Put Files in _../resources/schema_
- Go to Maven and look for **Plugins jsonschema2pojo**
- generate Classes with **jsonschema2pojo:generate**
- Classes are in _../target/classes/com/devguy/jsonschematojava_

## Build
- `mvn compile install package`

- `sudo docker build -t schema-to-pojo-docker.jar .`
- `sudo docker image ls`
- `sudo docker run -p 9090:8080 schema-to-pojo-docker.jar`

## Testing

call http://localhost:9090/message
