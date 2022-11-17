FROM openjdk:8-jdk-alpine
MAINTAINER rifkisatriya <2041720218@student.polinema.ac.id>
RUN mkdir -p /app
WORKDIR /app

COPY Aritmatika.java /app

#compile file java
RUN javac Aritmatika.java

#running java
CMD ["java","Aritmatika"]
