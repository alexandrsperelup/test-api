# Api Test Framework

## Description
A test automation framework using Java 11, Maven, JUnit 5 and RestAssured.

## Prerequisites
- Java 11+
- Maven 3.6+
- Docker (optional)

## How to Run

### 1. Run Locally
mvn clean test -DthreadCount=5

### 2. Generate Allure Report
mvn allure:serve

### 3. Run in Docker
docker build -t api-test-framework .

### 4 Run tests in Docker:
docker run --rm -e THREAD_COUNT=5 api-test-framework

### 5. Generate the report in Docker:
docker run --rm -v $(pwd)/allure-results:/app/allure-results api-test-framework allure serve
