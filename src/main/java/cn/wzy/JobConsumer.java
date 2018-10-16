package cn.wzy;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.listener.MessageListener;

public class JobConsumer implements MessageListener<Long, String> {

  public void onMessage(ConsumerRecord<Long, String> record) {
    System.out.println("====received====");
    System.out.println(record.key() + " : " + record.value());
    System.out.println("====received====");
  }


}
