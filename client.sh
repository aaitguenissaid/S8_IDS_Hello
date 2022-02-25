#!/bin/bash
java -classpath .:classes:lib/Hello.jar:lib/Info_itf.jar:lib/Hello2.jar:lib/Registry_itf.jar:lib/Accounting_itf.jar HelloClient localhost;