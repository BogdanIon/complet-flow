FROM gradle:6.6.1-jdk11 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon 

FROM adoptopenjdk/openjdk11-openj9:jre-11.0.8_10_openj9-0.21.0-debianslim
ENV APP_FILE worker-0.0.1-SNAPSHOT.jar
ENV APP_HOME /usr/apps
EXPOSE 8086
COPY --from=0 /home/gradle/src/build/libs/*.jar $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]
