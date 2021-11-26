package arr.learn.springaop.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class PassengerServiceImpl implements Passenger {


  private static final Logger LOGGER=LoggerFactory.getLogger(PassengerServiceImpl.class);

  @Override
  public void fly(String passengerName) {
    LOGGER.info("Fly solo, {} !!!", passengerName);
  }
}
