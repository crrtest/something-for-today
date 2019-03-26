FROM 674907502808.dkr.ecr.us-east-1.amazonaws.com/ws-docker-java8-corretto:11
USER root
RUN yum install -y wget
RUN wget https://s3-us-west-1.amazonaws.com/lampo-public-artifacts/newrelic/third-party-agents/hikaricp-2.4.0-SNAPSHOT.jar -P app/newrelic/extensions/
USER docker
ADD target/buzz.jar /app/buzz.jar
CMD ["java -jar ${JAVA_OPTS} /app/buzz.jar"]
