package arr.learn.springaop.service;

import arr.learn.springaop.domain.PassengerServiceImpl;
import org.junit.Before;
import org.junit.Test;

public class PassengerServiceTest {

  private String passengerName;

  private PassengerServiceImpl passengerService;

  @Before
  public void setUp(){
    passengerName = "Rahul";
    passengerService = new PassengerServiceImpl();
  }

  @Test
  public void testFly(){
    passengerService.fly(passengerName);
  }
}
