package cn.wzy;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.support.ProducerListener;


public class Listener implements ProducerListener<Long, String> {

  public void onSuccess(String topic, Integer partition, Long key, String value, RecordMetadata recordMetadata) {
//    System.out.println("====send success====topic " + topic);
  }

  @Override
  public void onError(ProducerRecord<Long, String> producerRecord, Exception exception) {
    exception.printStackTrace();
  }
}
