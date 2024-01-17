FROM openjdk:17-jdk-slim
WORKDIR /app
ARG JAR_PATH=./build/libs/solasido-0.0.1-SNAPSHOT.jar
COPY ${JAR_PATH} app.jar
CMD ["java","-jar","./app.jar"]