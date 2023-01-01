FROM tomcat:9
USER root
COPY build/libs/rest-api-basics-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/
RUN ln -s /usr/local/tomcat/webapps.dist/manager webapps/manager
RUN ln -s /usr/local/tomcat/webapps.dist/host-manager webapps/host-manager
RUN ln -s /usr/local/tomcat/webapps.dist/ROOT webapps/ROOT

EXPOSE 8080
CMD ["catalina.sh", "run"]
