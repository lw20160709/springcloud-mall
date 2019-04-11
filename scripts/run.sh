#eruka 启动：
java -jar spring-cloud-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
java -jar spring-cloud-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
#config 启动:
java -jar config-server-1.0-SNAPSHOT.jar --spring.config.location=C:\workspace\work\projects\springcloud-mall\config-server\src\main\resources\application1.yml
java -jar config-server-1.0-SNAPSHOT.jar --spring.config.location=C:\workspace\work\projects\springcloud-mall\config-server\src\main\resources\application2.yml