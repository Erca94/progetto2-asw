########################################################
# Dockerfile per il servizio principale S 
########################################################

FROM frolvlad/alpine-oraclejdk8 

ADD target/progetto_asw-s-0.0.1-SNAPSHOT.jar progetto_asw-s.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "progetto_asw-s.jar"]

