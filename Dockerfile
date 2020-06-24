From java:8
MAINTAINER lhTest
VOLUME /tmp
ADD feign.jar feign.jar
RUN bash -c 'touch /feign.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/feign.jar"]
