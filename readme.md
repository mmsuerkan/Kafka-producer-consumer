docker-compose up

docker exec -it <kafka_conatiner_id> sh
cd /opt/kafka_<version>/bin

kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 1 --topic quickstart

kafka-console-producer.sh --topic quickstart --bootstrap-server localhost:9092

kafka-console-consumer.sh --topic quickstart --from-beginning --bootstrap-server localhost:9092
