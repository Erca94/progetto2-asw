#!/bin/bash

echo 'Starting project application as a stack' 

source "docker.env"

docker stack deploy --compose-file docker-stack-applicazione-9005.yml applicazione-9005
