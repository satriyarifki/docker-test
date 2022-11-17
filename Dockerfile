FROM openjdk:8-jdk-alpine
MAINTAINER rifkisatriya <2041720218@student.polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY main.java /app

#compile file java
RUN javac main.java

#running java
CMD ["java","main"]
