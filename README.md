# carnumberJSP
Spring JPetStore sample application

- Tomcat    
[v6.0.32](https://archive.apache.org/dist/tomcat/tomcat-6/v6.0.32/bin/apache-tomcat-6.0.32.zip)

- Eclipse JEE    
[v3.7.2](https://archive.eclipse.org/technology/epp/downloads/release/indigo/SR2/eclipse-jee-indigo-SR2-win32.zip)

## Tomcat
New -> Other -> Server:    
Apache -> Tomcat v6.0 Server
```
Name: default
Tomcat installation directory: D:\programs\apache-tomcat-6.0.32
```

## Libs

### Original version
- log4j
```
v1.2.15
```
- Spring Framework
```
v2.5.6 SEC1
```
include:
```
spring.jar
spring-webmvc.jar
```
- mysql-connector-java
```
v5.0.8
```
- commons-dbcp
```
v1.2.2
```
- commons-logging
```
v1.1.1
```
- commons-pool
```
v1.3
```

## java version

### DBCP
- DBCP 2.9.0 for JDBC 4.2 (Java 8)
- DBCP 2.4.0 for JDBC 4.1 (Java 7)
- DBCP 1.4 for JDBC 4 (Java 6)
- DBCP 1.3 for JDBC 3 (Java 1.4 and Java 5.0)


## MySQL

### com.mysql.jdbc.Driver
 WARN: Establishing SSL connection without server's identity verification is not recommended. 
 According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. 
 For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. 
 You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.

Add to [the connection string URL](https://stackoverflow.com/a/34449182):
```
?useSSL=false
```
