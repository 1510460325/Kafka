package cn.wzy;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;

public class JobConsumer2 implements MessageListener<Long, String> {

  public void onMessage(ConsumerRecord<Long, String> record) {
    System.out.println("==JobConsumer2 received:" + record.key() + " : " + record.value());
  }


}
