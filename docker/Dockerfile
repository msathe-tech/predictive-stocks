FROM openjdk:8-jre-alpine
wget http://localhost:8081/artifactory/my-first-repo/com/acme/predictive-stocks/0.0.1-SNAPSHOT/predictive-stocks-0.0.1-SNAPSHOT.jar
COPY predictive-stocks-0.0.1-SNAPSHOT.jar /app.jar
CMD ["/usr/bin/java", "-jar", "/app.jar"]
