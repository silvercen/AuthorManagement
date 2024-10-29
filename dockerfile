FROM amazoncorretto:21.0.5-alpine3.20
COPY ./target/AuthorManagement-0.0.1-SNAPSHOT.jar AuthorManagement.jar
CMD ["java","-jar","AuthorManagement.jar"]