FROM openjdk:8
MAINTAINER Mudit mudit.goyal@iiitb.ac.in
COPY ./target/DevopsCalc-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "DevopsCalc-1.0-SNAPSHOT-jar-with-dependencies.jar"]
