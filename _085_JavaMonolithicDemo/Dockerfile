#ilk olarak kullanılacak JDK sürümü seçilir.
FROM amazoncorretto:19
# Jar dosyasının docker'a kopyalanması:
#1.yol:
#COPY build/libs/demo-0.0.1-SNAPSHOT.jar app.jar
#2.yol:
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
# Eğer sistemde güncellemelerin yapılmasını istersen.
#CMD apt-get update -y
#Jarı çalıştırma komutu:
ENTRYPOINT ["java","-jar","/app.jar"]

#Argüman kullanarak oluşturulan dockerfile'in çalıştırılması için:
#1.yol:
#docker build --build-arg JAR_FILE=[build/libs/demo-0.0.1-SNAPSHOT.jar] .
#2.Yol: eğer dockerhub hesabınıza kopyalayacaksanız.
#docker build --build-arg JAR_FILE=[build/libs/demo-0.0.1-SNAPSHOT.jar] -t barisde/java9:001 .
