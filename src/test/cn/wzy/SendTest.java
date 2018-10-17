package cn.wzy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class SendTest {


  @Autowired
  private KafkaTemplate<Long, String> kafkaTemplate;

  @Test
  public void test() throws InterruptedException {
    for (long i = 1; i < 50; i++) {
      kafkaTemplate.sendDefault(i,"message : hello world");
    }
    Thread.sleep(5000);
  }
}
