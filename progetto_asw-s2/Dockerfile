########################################################
# Dockerfile per il servizio secondario S2 
########################################################

FROM frolvlad/alpine-oraclejdk8 

ADD target/progetto_asw-s2-0.0.1-SNAPSHOT.jar progetto_asw-s2.jar

EXPOSE 8080

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "progetto_asw-s2.jar"]

