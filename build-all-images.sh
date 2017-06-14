#!/bin/bash

source "docker.env"

# DOCKER_REGISTRY=localhost:5000
DOCKER_REGISTRY=swarm.inf.uniroma3.it:5000

docker build --rm -t ${DOCKER_REGISTRY}/server-eureka-9005 ./progetto_asw-eureka
docker build --rm -t ${DOCKER_REGISTRY}/gateway-zuul-9005 ./progetto_asw-zuul 
docker build --rm -t ${DOCKER_REGISTRY}/service-s-9005 ./progetto_asw-s 
docker build --rm -t ${DOCKER_REGISTRY}/service-s1-9005 ./progetto_asw-s1
docker build --rm -t ${DOCKER_REGISTRY}/service-s2-9005 ./progetto_asw-s2






