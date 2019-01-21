FROM openjdk:8-jre-alpine
RUN apk update && apk add wget
RUN wget http://Madhavs-MacBook-Pro.local:8081/artifactory/my-first-repo/com/acme/predictive-stocks/0.0.1-SNAPSHOT/predictive-stocks-0.0.1-SNAPSHOT.jar -O /app.jar
# COPY predictive-stocks-0.0.1-SNAPSHOT.jar /app.jar
CMD ["/usr/bin/java", "-jar", "/app.jar"]
