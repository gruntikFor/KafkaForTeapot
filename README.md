# KafkaForTeapot
It's test project for learn Kafka 2.8.1

Download Zookeeper https://zookeeper.apache.org/releases.html#download

Download Kafka 2.8.1 https://kafka.apache.org/downloads

How to start?
1. Add system variable ZOOKEEPER_HOME = C:\ZooKeeper\apache-zookeeper-3.7.0-bin
2. Add in Path %ZOOKEEPER_HOME%\bin;
3. Change line in zoo.cfg to dataDir=C:\\Zookeeper\\apache-zookeeper-3.7.0-bin
4. Change line in zookeeper.properties to dataDir=c:/kafka/zookeeper-data
5. Change line in server.properties to log.dirs=C:/kafka/kafka-logs

Commands for start

start C:\kafka\bin\windows\zookeeper-server-start.bat C:\kafka\config\zookeeper.properties

timeout /t 10

start C:\kafka\bin\windows\kafka-server-start.bat C:\kafka\config\server.properties
