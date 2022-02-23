#!/bin/bash

javac -d classes -classpath .:classes src/Hello.java;

(cd classes/; bash create_HelloJar.sh)

javac -d classes -classpath .:classes src/HelloImpl.java;

(cd classes/; bash create_HelloImplJar.sh)

javac -d classes -cp .:classes:lib/Hello.jar:lib/HelloImpl.jar src/HelloServer.java;

javac -d classes -cp .:classes:lib/Hello.jar src/HelloClient.java;
