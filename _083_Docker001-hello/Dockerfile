#JDK sürümü
FROM openjdk:17

# projenin JAR dosyasinin image icindeki adresi
ARG JAR_FILE=target/*.jar

# image icindeki JAR dosyasinina adi
COPY ${JAR_FILE} application.jar

#Linux gucellemesi
CMD apt-get update-y

# projenin calisacagi ic port
EXPOSE 8080

# Container icin projedeki JAR dosyasi  calistiriliyor
ENTRYPOINT ["java", "-jar", "application.jar"]