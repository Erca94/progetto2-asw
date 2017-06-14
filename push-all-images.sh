#!/bin/bash

source "docker.env"

#DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker push ${DOCKER_REGISTRY}/server-eureka-9005
docker push ${DOCKER_REGISTRY}/gateway-zuul-9005
docker push ${DOCKER_REGISTRY}/service-s-9005
docker push ${DOCKER_REGISTRY}/service-s1-9005
docker push ${DOCKER_REGISTRY}/service-s2-9005






