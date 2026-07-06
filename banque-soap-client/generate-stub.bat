@echo off
echo Generation du Stub SOAP a partir du WSDL...
mvn com.sun.xml.ws:jaxws-maven-plugin:4.0.2:wsimport
echo Stub genere dans src/main/java/proxy
pause
