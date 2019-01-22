FROM openjdk:8-jre-alpine
# If you intend to pull it from a repo URL, else comment next two lines
RUN apk update && apk add wget
RUN wget http://Madhavs-MacBook-Pro.local:8081/artifactory/my-first-repo/com/acme/predictive-stocks/0.0.1-SNAPSHOT/predictive-stocks-0.0.1-SNAPSHOT.jar -O /app.jar
#If you intend to use local target JAR then uncomment line below & make sure you copy the JAR to local folder
# COPY predictive-stocks-0.0.1-SNAPSHOT.jar /app.jar
CMD ["/usr/bin/java", "-jar", "/app.jar"]
