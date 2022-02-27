#!/bin/bash
rm classes/*.class;
rm lib/*.jar;
#Accounting_itf
javac -d classes -classpath .:classes src/Accounting_itf.java;
cd classes;
jar cvf ../lib/Accounting_itf.jar Accounting_itf.class;
cd ..;
#Registry_itf
javac -d classes -classpath .:classes src/Registry_itf.java;
cd classes;
jar cvf ../lib/Registry_itf.jar Registry_itf.class;
cd ..;
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
#Hello2
javac -d classes -classpath .:classes src/Hello2.java;
cd classes;
jar cvf ../lib/Hello2.jar Hello2.class;
cd ..;
#InfoImpl
javac -d classes -classpath .:classes src/InfoImpl.java;
cd classes;
jar cvf ../lib/InfoImpl.jar InfoImpl.class;
cd ..;
#RegistryImpl
javac -d classes -classpath .:classes src/RegistryImpl.java;
cd classes;
jar cvf ../lib/RegistryImpl.jar RegistryImpl.class;
cd ..;
#HelloImpl
javac -d classes -classpath .:classes src/HelloImpl.java;
cd classes;
jar cvf ../lib/HelloImpl.jar HelloImpl.class;
cd ..;
#Hello2Impl
javac -d classes -classpath .:classes src/Hello2Impl.java;
cd classes;
jar cvf ../lib/Hello2Impl.jar Hello2Impl.class;
cd ..;
javac -d classes -cp .:classes:lib/Hello.jar:lib/HelloImpl.jar:lib/Info_itf.jar:lib/InfoImpl.jar:lib/Hello2.jar:lib/Hello2Impl.jar:lib/Registry_itf.jar:lib/RegistryImpl.jar:lib/Accounting_itf.jar src/HelloServer.java;
javac -d classes -cp .:classes:lib/Hello.jar:lib/Info_itf.jar:lib/Hello2.jar:lib/Registry_itf.jar:lib/Accounting_itf.jar src/HelloClient.java;