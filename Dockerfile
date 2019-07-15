#FROM openjdk:8-jdk-alpine
FROM java:8
MAINTAINER bhjayara@in.ibm.com
ADD ./target/petstorefeedback-0.0.1-SNAPSHOT.jar petstorefeedback-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","/petstorefeedback-0.0.1-SNAPSHOT.jar"]
