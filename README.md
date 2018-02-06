# SpringKafkaExample
Spring boot with Kafka Producer and Consumer Example

Start Apache Kafka Cluster:
– Start a ZooKeeper:


C:\kafka_2.12-0.10.2.1>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
1
C:\kafka_2.12-0.10.2.1>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
– Start the Apache Kafka server:


.\bin\windows\kafka-server-start.bat .\config\server.properties
1
.\bin\windows\kafka-server-start.bat .\config\server.properties

Build and Install the SpringBoot project with commandlines: mvn clean install and mvn spring-boot:run
