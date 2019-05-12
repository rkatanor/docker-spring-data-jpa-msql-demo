From tomcat:8
RUN rm -rf /usr/local/tomcat/webapps/*
COPY ./target/spring-datajpa-mysql-demo-0.0.1-SNAPSHOT.war  /usr/local/tomcat/webapps/springdatajpa.war
CMD ["catalina.sh","run"]