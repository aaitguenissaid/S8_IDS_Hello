#!/bin/bash

javac -d classes -classpath .:classes src/Hello.java;

jar cvf lib/Hello.jar classes/Hello.class;

javac -d classes -classpath .:classes src/HelloImpl.java;

jar cvf lib/HelloImpl.jar classes/HelloImpl.class;

javac -d classes -cp .:classes:lib/Hello.jar:lib/HelloImpl.jar src/HelloServer.java;

javac -d classes -cp .:classes:lib/Hello.jar src/HelloClient.java;
