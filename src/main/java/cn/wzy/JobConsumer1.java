package cn.wzy;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;

public class JobConsumer1 implements MessageListener<Long, String> {

  public void onMessage(ConsumerRecord<Long, String> record) {
    System.out.println("==JobConsumer1 received:" + record.key() + " : " + record.value());
  }


}
