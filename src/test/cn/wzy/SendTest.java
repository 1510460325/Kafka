package cn.wzy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class SendTest {


  @Autowired
  private KafkaTemplate<Integer,String> kafkaTemplate;

  @Test
  public void test() {
    kafkaTemplate.sendDefault(15, "asdf");
  }
}
