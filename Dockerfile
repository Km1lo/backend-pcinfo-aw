FROM openjdk:17
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/backendpcinfo-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} pc-info.jar
ENTRYPOINT ["java","-jar","/pc-info.jar"]