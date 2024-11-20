FROM maven:3.8.6-openjdk-11-slim

WORKDIR /app
COPY . /app
RUN mvn clean install

ENV THREAD_COUNT=3

ENTRYPOINT ["mvn", "test", "-DthreadCount=${THREAD_COUNT}"]
