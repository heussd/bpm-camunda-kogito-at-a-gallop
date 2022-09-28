FROM maven:3.8.6-eclipse-temurin-18 as builder

COPY src /usr/src/app/src
COPY pom.xml /usr/src/app

RUN mvn -f /usr/src/app/pom.xml clean package -q -Dquarkus.package.type=uber-jar


FROM eclipse-temurin:18-jre

WORKDIR /
COPY --from=builder /usr/src/app/target/process-backend-runner.jar ./quarkus-app.jar

ENTRYPOINT ["java", "-Dquarkus.http.host=0.0.0.0", "-jar", "./quarkus-app.jar"]
CMD         ["-Xms512m", "-Xmx4G"]

EXPOSE      8080


