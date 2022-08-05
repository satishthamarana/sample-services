FROM amazonlinux:latest
RUN amazon-linux-extras install -y epel >/dev/null && \
    yum install -y java-11-amazon-corretto-headless
    
RUN mkdir -p /opt/oms/app
ADD target/address-service-0.0.1-SNAPSHOT.jar /opt/oms/app/address-service.jar
CMD ["java","-jar","/opt/oms/app/address-service.jar"]
EXPOSE 8083
