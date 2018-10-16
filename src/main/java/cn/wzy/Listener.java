package cn.wzy;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.support.ProducerListener;


public class Listener implements ProducerListener<Integer, String> {

  public void onSuccess(String topic, Integer partition, Integer key, String value, RecordMetadata recordMetadata) {
    System.out.println("====success====");
    System.out.println("topic " + topic);
    System.out.println("====success====");
  }

  @Override
  public void onError(ProducerRecord<Integer, String> producerRecord, Exception exception) {
    exception.printStackTrace();
  }
}
