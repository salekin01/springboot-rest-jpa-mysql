FROM openjdk:11
WORKDIR /var/lib/docker/
COPY /target/docker-spring-rest.jar  .
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-spring-rest.jar"]
#CMD ["-start"]

