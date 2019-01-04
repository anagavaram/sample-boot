FROM openjdk:8

RUN mkdir /opt/splunk
WORKDIR /opt/splunk

RUN useradd -ms /bin/bash newuser

USER root

COPY ../../target/careers-0.0.1-SNAPSHOT.jar /opt/splunk

RUN chmod 755 /opt/splunk
RUN chmod 755 /opt/splunk/careers-0.0.1-SNAPSHOT.jar

CMD ["/usr/bin/java", "-jar", "-Dspring.profiles.active=default", "/opt/splunk/careers-0.0.1-SNAPSHOT.jar"]
