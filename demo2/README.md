
https://console.cloud.google.com/



https://community.chocolatey.org/courses/installation/installing?method=install-from-powershell-v3


Set-ExecutionPolicy Bypass -Scope Process -Force; iwr https://community.chocolatey.org/install.ps1 -UseBasicParsing | iex


https://kubernetes.io/docs/tasks/tools/install-kubectl-windows/#install-nonstandard-package-tools

choco install kubernetes-cli

kubectl version --client



https://console.cloud.google.com/kubernetes/list/overview?authuser=2&project=high-victor-390215

https://cloud.google.com/sdk/docs/install

https://dl.google.com/dl/cloudsdk/channels/rapid/GoogleCloudSDKInstaller.exe

https://console.cloud.google.com/kubernetes/list/overview?authuser=2&project=high-victor-390215

Menu click to connect

gcloud container clusters get-credentials autopilot-cluster-1 --region us-central1 --project high-victor-390215

gcloud auth login

gcloud config set project high-victor-390215

gcloud components install gke-gcloud-auth-plugin


kubectl get nodes

kubectl config get-contexts

kubectl set-contexts gke_high-victor-390215_us-central1_autopilot-cluster-1


application.properties
server.port=8088


Dockerfile
FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar
CMD apt-get update-y
ENTRYPOINT ["java", "-jar", "application.jar"]

OR 

FROM amazoncorretto:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar
CMD apt-get update-y
ENTRYPOINT ["java", "-Xmx2048M", "-jar", "/application.jar"]



TERMINAL
docker  build  --build-arg   JAR_FILE=build/libs/demo2-1.0.0.jar   -t    mimaraslan/demo2app:v001  . 

docker  run  -p  8080:8080  -d  mimaraslan/demo2app:v001 

               //ic_port : dis_port
docker  run  -d  -p  8080:8080   mimaraslan/demo2app:v001 




TERMIAL
kubectl --help
kubectl config get-contexts

CLUSTER ÇALIŞMA ALANINI DEĞİŞTİRME
kubectl config use-contexts   gke_high-victor-390215_us-central1-c_cluster-2








https://hub.docker.com/_/postgres
docker pull postgres

docker run --name my-postgresqldb1 -e POSTGRES_PASSWORD=123456789 -d postgres

docker run --name my-postgresqldb2 -e POSTGRES_PASSWORD=123456789 -d  -p 9998:5432 postgres


docker  network  ls

docker  network     create --driver      bridge  --subnet  182.18.0.1/24  --gateway  182.18.0.1     my-network  
docker  network  ls 

docker  network rm my-lolo
docker  network  ls


DB RUN - local on Docker
docker run  --name my-postgresqldb3  -e POSTGRES_PASSWORD=123456789    --net  my-network    -d   -p 9999:5432 postgres

Docker Desktop - postgresql CLI for create a DB
su postgres
createdb MyDemoAppDB
psql -d MyDemoAppDB
ls
\l 



application.properties ya da application.yml 
spring.datasource.url = jdbc:postgresql://my-postgresqldb3

spring:
  datasource:
    drive-clas-name: org.postgresql.Driver
    url: jdbc:postgresql://localhost:5432/CommentAppDB
#   url: jdbc:postgresql://localhost:9999/CommentAppDB
#   url: jdbc:postgresql://my-postresqlnetwork/CommentAppDB
  
  
  

JAVA JAR BUILD
docker  build  --build-arg   JAR_FILE=build/libs/demo2-1.0.0.jar   -t    mimaraslan/demo2app:v002  . 

  
JAVA  RUN
                                //ic_port : dis_port(server.port:9090)
docker  run  --net my-network   -d  -p  8095:9090   mimaraslan/demo2app:v002 


 --------------------------
 TERMINAL
 kubectl run mypod --image=mimaraslan/demo2app
 kubectl get pods
 kubectl delete pods mypod
 
kubectl config get-contexts
 
 
gcloud container clusters get-credentials autopilot-cluster-1 --region us-central1 --project high-victor-390215
 
gcloud auth login

gcloud config set project high-victor-390215

gcloud components install gke-gcloud-auth-plugin


kubectl get nodes

kubectl config get-contexts

CREATE 
gcloud container clusters get-credentials cluster-1 --zone us-central1-c --project high-victor-390215

kubectl set-contexts gke_high-victor-390215_us-central1_autopilot-cluster-1


kubectl config get-contexts
kubectl config use-contexts   gke_high-victor-390215_us-central1_autopilot-cluster-1


C:\Users\mimar\.kube

kubectl run --help 

kubectl get pods





kubectl run mypod --image=mimaraslan/demo2app
kubectl run mypod --image=javaboost2/dockerdeme:v001

kubectl describe pods  mypod

kubectl get deployments


kubectl apply -f .\mypodinfo.yml






PowerShell
PS C:\Users\mimar> cd D:\k8s
PS D:\k8s> gcloud container clusters get-credentials cluster-1 --zone us-central1-a --project high-victor-390215
Fetching cluster endpoint and auth data.
kubeconfig entry generated for cluster-1.
PS D:\k8s> kubectl config get-contexts
CURRENT   NAME                                             CLUSTER                                          AUTHINFO                                         NAMESPACE
          docker-desktop                                   docker-desktop                                   docker-desktop                                  
*         gke_high-victor-390215_us-central1-a_cluster-1   gke_high-victor-390215_us-central1-a_cluster-1   gke_high-victor-390215_us-central1-a_cluster-1  


PS D:\k8s> kubectl get pods
No resources found in default namespace.


PS D:\k8s> kubectl get pods
NAME          READY   STATUS    RESTARTS   AGE
mypodcreate   1/1     Running   0          7m28s


PS D:\k8s> kubectl get pods -o wide
NAME          READY   STATUS    RESTARTS   AGE   IP          NODE                                       NOMINATED NODE   READINESS GATES
mypodcreate   1/1     Running   0          13m   10.8.0.10   gke-cluster-1-default-pool-f8795e93-mzqm   <none>           <none>
PS D:\k8s>











PS D:\k8s> kubectl apply -f .\mypodinfo.yml  
pod/mypodcreate configured


PS D:\k8s> kubectl describe pods mypodcreate
Name:             mypodcreate
Namespace:        default
Priority:         0
Service Account:  default
Node:             gke-cluster-1-default-pool-f8795e93-mzqm/10.128.0.11
Start Time:       Tue, 27 Jun 2023 13:55:59 +0300
Labels:           app=user-service
                  type=back-end
Annotations:      <none>
Status:           Pending
IP:               10.8.0.10
IPs:
  IP:  10.8.0.10
Containers:
  mypodcreate:
    Container ID:   
    Image:          javaboost2/dockerdeme:v001
    Image ID:
    Port:           9090/TCP
    Host Port:      0/TCP
    State:          Waiting
      Reason:       ImagePullBackOff
    Ready:          False
    Restart Count:  0
    TokenExpirationSeconds:  3607
    ConfigMapName:           kube-root-ca.crt
    ConfigMapOptional:       <nil>
    DownwardAPI:             true
Tolerations:                 node.kubernetes.io/not-ready:NoExecute op=Exists for 300s
                             node.kubernetes.io/unreachable:NoExecute op=Exists for 300s
Events:
  Type     Reason     Age                    From               Message
  ----     ------     ----                   ----               -------
  Normal   Scheduled  6m29s                  default-scheduler  Successfully assigned default/mypodcreate to gke-cluster-1-default-pool-f8795e93-mzqm      
  Normal   Pulling    4m51s (x4 over 6m28s)  kubelet            Pulling image "avaboost2/dockerdeme:v001"
  Warning  Failed     4m51s (x4 over 6m27s)  kubelet            Failed to pull image "avaboost2/dockerdeme:v001": rpc error: code = Unknown desc = failed to pull and unpack image "docker.io/avaboost2/dockerdeme:v001": failed to resolve reference "docker.io/avaboost2/dockerdeme:v001": pull access denied, repository does not exist or may require authorization: server message: insufficient_scope: authorization failed
  Warning  Failed     4m51s (x4 over 6m27s)  kubelet            Error: ErrImagePull
  Warning  Failed     4m37s (x6 over 6m27s)  kubelet            Error: ImagePullBackOff
  Normal   BackOff    81s (x20 over 6m27s)   kubelet            Back-off pulling image "avaboost2/dockerdeme:v001"
  
  
  
PS D:\k8s> kubectl get pods -o wide
NAME          READY   STATUS    RESTARTS   AGE   IP          NODE                                       NOMINATED NODE   READINESS GATES
mypodcreate   1/1     Running   0          12m   10.8.0.10   gke-cluster-1-default-pool-f8795e93-mzqm   <none>           <none>
PS D:\k8s> 


PS D:\k8s> kubectl logs mypodcreate

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.7.4)

2023-06-27 11:02:29.615  INFO 1 --- [           main] c.m.d.DockerdenemeApplication            : Starting DockerdenemeApplication using Java 17.0.4.1 on mypodcreate with PID 1 (/appbenbirjavauygulamasiyim.jar started by root in /)
2023-06-27 11:02:29.620  INFO 1 --- [           main] c.m.d.DockerdenemeApplication            : No active profile set, falling back to 1 default profile: "default"
2023-06-27 11:02:31.517  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 9090 (http)
2023-06-27 11:02:31.542  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-06-27 11:02:31.544  INFO 1 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.65]
2023-06-27 11:02:31.719  INFO 1 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-06-27 11:02:31.720  INFO 1 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1959 ms
2023-06-27 11:02:32.689  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 9090 (http) with context path ''
2023-06-27 11:02:32.708  INFO 1 --- [           main] c.m.d.DockerdenemeApplication            : Started DockerdenemeApplication in 3.854 seconds (JVM running for 4.797)
PS D:\k8s>



PS D:\k8s> kubectl exec -it mypodcreate 	 -- 	bash

bash-4.2# ls
appbenbirjavauygulamasiyim.jar  bin  boot  dev  etc  home  lib  lib64  local  media  mnt  opt  proc  root  run  sbin  srv  sys  tmp  usr  var

bash-4.2# printenv
HOSTNAME=mypodcreate
TERM=xterm
KUBERNETES_PORT_443_TCP_PORT=443
KUBERNETES_PORT=tcp://10.12.0.1:443
KUBERNETES_SERVICE_PORT=443
KUBERNETES_SERVICE_HOST=10.12.0.1
PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin
PWD=/
JAVA_HOME=/usr/lib/jvm/java-17-amazon-corretto
LANG=C.UTF-8
SHLVL=1
HOME=/root
KUBERNETES_PORT_443_TCP_PROTO=tcp
KUBERNETES_SERVICE_PORT_HTTPS=443
KUBERNETES_PORT_443_TCP_ADDR=10.12.0.1
KUBERNETES_PORT_443_TCP=tcp://10.12.0.1:443
_=/usr/bin/printenv
bash-4.2# exit






PS D:\k8s> kubectl get pods -w
NAME          READY   STATUS    RESTARTS   AGE
mypodcreate   1/1     Running   0          45m
mypodcreate   1/1     Terminating   0          47m
mypodcreate   0/1     Terminating   0          47m
mypodcreate   0/1     Terminating   0          47m
mypodcreate   0/1     Terminating   0          47m




PS D:\k8s> kubectl get pods
NAME          READY   STATUS    RESTARTS   AGE
mypodcreate   1/1     Running   0          46m


PS D:\k8s> kubectl delete  pod mypodcreate
pod "mypodcreate" deleted


PS D:\k8s> kubectl get pods
No resources found in default namespace.
PS D:\k8s>




K8s services object type
LoadBalancer
Node Port
Cluster IP


IP sizi bilgisyara kadar götürür, port ise kapı numarasıdır. 



kubectl describe pods mypodcreate
 
kubectl describe services docker-loadBalancer 
 
 
TERMINAL 
kubectl apply -f .\deployment_postgresql.yml 
 
kubectl get pods 
 
kubectl logs postgresql deployment_postgresql_mypod







