FROM openjdk:11-jre-slim
EXPOSE 8089
COPY target/pipelineflowproject.jar pipelineflowproject.jar
ENTRYPOINT ["java", "-jar", "/pipelineflowproject.jar"]
