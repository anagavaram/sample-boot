FROM java:oracle-java8

RUN mkdir /opt/splunk/apps
WORKDIR /opt/splunk/apps

RUN useradd -ms /bin/bash newuser

USER newuser
WORKDIR /home/newuser

COPY target/careers-0.0.1-SNAPSHOT.jar /opt/splunk/apps/

ENTRYPOINT ["java -jar -Xmx1024m /opt/splunk/apps/careers-0.0.1-SNAPSHOT.jar"]

