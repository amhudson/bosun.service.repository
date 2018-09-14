FROM openjdk:8-jre-alpine
ARG BMRG_TAG
VOLUME /tmp
EXPOSE 7716
ADD target/service-repository-$BMRG_TAG.jar service.jar
RUN sh -c 'touch /service.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /service.jar" ]
