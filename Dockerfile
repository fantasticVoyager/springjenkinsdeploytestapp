FROM tomcat:9.0

COPY target/spring-jenkins-deploy-test-app-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/app.war

EXPOSE 8080

#build with docker build --tag k-web-app-test1.0 .
#run this with docker container run --rm --name tomcatTest -p 8888:8080 k-web-app-test1.0