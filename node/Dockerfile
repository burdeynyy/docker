FROM maven:3.3.9-jdk-8

RUN mkdir -p /opt/app
WORKDIR /opt/app

ADD . /opt/app/

EXPOSE 8080

RUN mvn clean install

CMD ["mvn", "jetty:run"]

#sudo docker build --tag=app .
#sudo docker run -p 8080:8080 -t -i app
