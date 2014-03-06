
Rem
Rem axis.bat : $Revision$
Rem


set prj=D:\Java_homework\joelle_workspace\WSDEMO
set lib=%prj%/WEB-INF/lib


java -classpath %prj%\WEB-INF\classes;%lib%\axis.jar;%lib%\commons-logging-1.1.jar;%lib%\commons-discovery-0.2.jar;%lib%\jaxrpc.jar;%lib%\saaj.jar;%lib%\wsdl4j-1.6.2.jar;%lib%\xerces.jar org.apache.axis.wsdl.Java2WSDL -o Service.wsdl -l"http://localhost:8080/WSDEMO/services/WS" -n urn:WS   -poddo.webservices=urn:WS   -u LITERAL wsdemo.cls.ws.WS 
pasue:

java -classpath %lib%\commons-discovery-0.2.jar;%lib%\commons-logging-1.1.jar;%lib%\axis.jar;%lib%\wsdl4j-1.6.2.jar;%lib%\jaxrpc.jar org.apache.axis.wsdl.WSDL2Java -s  -pwsdemo.cls.ws service.wsdl
pause: