FROM openjdk:8-jdk-alpine
EXPOSE 5000
COPY target/orders-*.jar orders.jar
ENTRYPOINT ["java","-jar","/orders.jar"]