# demo1-ciip1

1. Apache ZooKeeper 3.7.1 (latest stable release) //2023-03-24
https://zookeeper.apache.org/releases.html 

2. download 후 압축을 푼다.
> tar -xvf ./apache-zookeeper-3.7.1-bin.tar.gz

3. cfg 파일 설정 변경
> cd ./apache-zookeeper-3.7.1-bin/conf

> cp ./zoo_sample.cfg zoo.cfg

> cd ..

> bin/zkServer.sh start

or
```
$ tar -xzf apache-zookeeper-3.7.1-bin.tar.gz
$ cd apache-zookeeper-3.7.1-bin
$ cp conf/zoo_sample.cfg conf/zoo.cfg

# Run Zookeeper
$ bin/zkServer.sh start 또는 bin/zkServer.sh start-foreground
```

> .\bin\zkServer.cmd <-- (window::JAVA_HOME 세팅 되어 있어야 함.)     

4. apache kafka https://kafka.apache.org/downloads 

> tar -xvf kafka_2.13-2.8.2

> cd kafka_2.12-2.8.2

> bin/kafka-server-start.sh config/server.properties

> bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092

| Created topic quickstart-events.

> bin/kafka-topics.sh --list --zookeeper localhost:2181

| quickstart-events

```
# Run Zookeeper
$ bin/zookeeper-server-start.sh config/zookeeper.properties

# Run Kafka
$ bin/kafka-server-start.sh config/server.properties

# Create Topic
$ bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092

# Show List Topic
$ bin/kafka-topics.sh --list --zookeeper localhost:2181

# Describe Topic
$ bin/kafka-topics.sh --describe --topic quickstart-events --bootstrap-server localhost:9092

# Write Message
$ bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092

# Read Message
$ bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092

# Remove Topic 
$ bin/kafka-topics.sh --delete --topic quickstart-events --bootstrap-server localhost:9092
```

(window)
```
> bin\windows\kafka-server-start.bat \config\server.properties
> .\bin\windows\kafka-topics.bat --create --topic quickstart-events --bootstrap-server localhost:9092
> .\bin\windows\kafka-topics.bat --list --zookeeper localhost:2181
```
check spring boot suport : https://spring.io/projects/spring-boot#support 

