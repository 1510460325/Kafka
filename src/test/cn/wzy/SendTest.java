package cn.wzy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.listener.KafkaMessageListenerContainer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class SendTest {


  @Autowired
  private KafkaTemplate<Long,String> kafkaTemplate;

  @Autowired
  private KafkaMessageListenerContainer container;
  @Test
  public void test() {
    kafkaTemplate.sendDefault(15L, "asdf");
  }
}
