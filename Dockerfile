FROM openjdk:17
COPY build/libs/Securedemo-0.0.1-SNAPSHOT.jar Securedemo-0.0.1-SNAPSHOT.jar
CMD java -jar Securedemo-0.0.1-SNAPSHOT.jar