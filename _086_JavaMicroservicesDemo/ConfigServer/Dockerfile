#JDK sürümü
FROM openjdk:17

# projenin JAR dosyasinin image icindeki adresi
ARG JAR_FILE=target/*.jar

# image icindeki JAR dosyasinin ad
COPY ${JAR_FILE} application.jar

#Linux gucellemesi
CMD apt-get update-y

# projenin calisacagi ic port
EXPOSE 8888

# Container icin projedeki JAR dosyasi  calistiriliyor
ENTRYPOINT ["java", "-jar", "application.jar"]


# Docker image haline getirme komutu
# docker build --build-arg JAR_FILE=build/libs/ConfigServer-v.0.0.1.jar -t mimaraslan/config-server:v001 .

