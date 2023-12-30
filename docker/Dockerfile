FROM 11.0.20.8.1
WORKDIR /app/deployment
COPY . /app/deployment
ENV JAVA_OPTS = "-XX:MinRAMPercentage=50.0 -XX:MaxRAMPercentage=80.0"
ENTRYPOINT ["java","-jar","/app/deployment/*.jar"]