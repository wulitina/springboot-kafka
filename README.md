
![img.png](readme-pic%2Fimg.png)

# Spring Boot Kafka Tutorial

This project demonstrates how to integrate Apache Kafka with Spring Boot for producing and consuming messages in both plain text and JSON formats.

## Running the Application
1. Ensure Kafka is running on localhost:9092.
2. Build the project using Maven:
```bash
./mvnw clean install
```
3. Run the Spring Boot application:
```bash
./mvnw spring-boot:run
```

## Endpoints
### MessageController
- POST /api/v1/kafka/publish
- Description: Publish a plain text message to Kafka.
- Request Body: `{ "message": "your_message" }`
- Example:
  ```bash
  curl -X POST http://localhost:8080/api/v1/kafka/publish -H "Content-Type: application/json" -d '{"message": "Hello Kafka"}'
  ```
### JsonMessageController
- POST /api/v1/kafka/publishJson
- Description: Publish a JSON message to Kafka.
- Request Body: `{ "name": "your_name", "age": your_age }`
- Example:
```bash
curl -X POST http://localhost:8080/api/v1/kafka/publishJson -H "Content-Type: application/json" -d '{"name": "John", "age": 30}'
```

## Dependencies
- Spring Boot Starter Kafka
- Apache Kafka
- Spring Boot Starter Web
- Lombok

