#!/bin/bash
java -classpath .:classes:lib/Hello.jar:lib/HelloImpl.jar:lib/Info_itf.jar:lib/InfoImpl.jar:lib/Hello2.jar:lib/Hello2Impl.jar:lib/Registry_itf.jar:lib/RegistryImpl.jar:lib/Accounting_itf.jar HelloServer;