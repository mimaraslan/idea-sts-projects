# DOCKER 4LÜ KURULUM
## ZIPKIN
    docker run -d -p 9411:9411 --memory=512m  openzipkin/zipkin

## RABBITMQ KURULUM 

    docker run -d --hostname my-rabbit --name some-rabbit -e RABBITMQ_DEFAULT_USER=user -e RABBITMQ_DEFAULT_PASS=user -p 15672:15672 -p 5672:5672  --memory=128m  rabbitmq:3-management

## REDIS
    docker run --name redis-java9 -p 6379:6379 --memory=128m -d redis

## ELASTIC SEARCH
### Network:
     docker network create somenetwork
### Elastic:
    docker run -d --name elasticsearch --net somenetwork -p 9200:9200 -p 9300:9300 -e "discovery.type=single-node" --memory=512m  elasticsearch:7.17.3
### Kibana:
    docker run -d --name kibana --net somenetwork -p 5601:5601 kibana:7.17.3


# DEFAULT PORTLAR
    Zipkin      :   9411
    RabbitMQ    :   15672 ve AMQP:5672
    REDIS       :   6379
    Elastic     :   9200 ve 9300
    Kibana      :   5601