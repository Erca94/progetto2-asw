########################################################
# Dockerfile per il server eureka 
########################################################

FROM frolvlad/alpine-oraclejdk8 

ADD target/progetto_asw-eureka-0.0.1-SNAPSHOT.jar progetto_asw-eureka.jar

EXPOSE 8761

ENTRYPOINT ["/usr/bin/java", "-Xmx128m", "-Xms128m"]

CMD ["-jar", "progetto_asw-eureka.jar"]

