#!/bin/bash
#Info_itf
javac -d classes -classpath .:classes src/Info_itf.java;
cd classes;
jar cvf ../lib/Info_itf.jar Info_itf.class;
cd ..;
#Hello
javac -d classes -classpath .:classes src/Hello.java;
cd classes;
jar cvf ../lib/Hello.jar Hello.class;
cd ..;
#InfoImpl
javac -d classes -classpath .:classes src/InfoImpl.java;
cd classes;
jar cvf ../lib/InfoImpl.jar InfoImpl.class;
cd ..;
#HelloImpl
javac -d classes -classpath .:classes src/HelloImpl.java;
cd classes;
jar cvf ../lib/HelloImpl.jar HelloImpl.class;
cd ..;
javac -d classes -cp .:classes:lib/Hello.jar:lib/HelloImpl.jar:lib/Info_itf.jar:lib/InfoImpl.jar src/HelloServer.java;
javac -d classes -cp .:classes:lib/Hello.jar:lib/Info_itf.jar src/HelloClient.java;