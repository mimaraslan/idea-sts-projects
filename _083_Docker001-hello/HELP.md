# Docker Tag versions

### v001

docker build --build-arg  JAR_FILE=build/libs/_083_Docker001-hello-0.0.1-SNAPSHOT.jar -t  mimaraslan/docker001-hello:v001 .


* DIŞ_PORT : İÇ_PORT

docker run -d -p 8081:8080 mimaraslan/docker001-hello:v001

http://localhost:8080/api/v1/hello
