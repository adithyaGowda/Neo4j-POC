FROM openjdk:11
ADD ./target/neo4j-poc-0.0.1-SNAPSHOT.jar /usr/src/neo4j-poc-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar","neo4j-poc-0.0.1-SNAPSHOT.jar"]
