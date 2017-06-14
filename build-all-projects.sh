#!/bin/bash

# script per compilare tutti i servizi 

echo Building Eureka Server 

cd progetto_asw-eureka

mvn install

cd ..

#-----------------------------

echo Building Zuul Gateway 

cd progetto_asw-zuul

mvn install

cd ..

#-----------------------------

echo Building Service S 

cd progetto_asw-s

mvn install

cd ..

#-----------------------------

echo Building Service S1 

cd progetto_asw-s1

mvn install

cd ..

#-----------------------------

echo Building Service S2 

cd progetto_asw-s2

mvn install

cd ..
