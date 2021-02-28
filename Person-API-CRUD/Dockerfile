FROM java:8

EXPOSE 8080

ADD target/Person-API-CRUD.jar Person-API-CRUD.jar

ENTRYPOINT ["java","-jar","Person-API-CRUD.jar","-web -webAllowOthers -tcpAllowOthers -browser"]