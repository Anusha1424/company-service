From openjdk:8
copy ./target/compnay-service-0.0.1-SNAPSHOT.jar compnay-service-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","compnay-service-0.0.1-SNAPSHOT.jar"]
EXPOSE 8090