FROM gradle:7-jdk11 AS build
WORKDIR /home/gradle/src
COPY    --chown=gradle:gradle build.gradle settings.gradle ./
COPY    --chown=gradle:gradle src/ ./src/

RUN     gradle build --no-watch-fs --no-daemon --warn



FROM openjdk:11
WORKDIR /

ENTRYPOINT ["java", "-jar", "/app.jar"]
CMD ["-Xms1048m", "-Xmx1048m"]
EXPOSE  8080

COPY    --from=build /home/gradle/src/build/libs/*.jar /app.jar
