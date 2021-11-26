package arr.learn.springaop.rest;

import arr.learn.springaop.domain.PassengerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelController {

  private static final Logger LOGGER = LoggerFactory.getLogger(TravelController.class);

  @Autowired
  private PassengerService passengerService;

  @GetMapping(value = "/fly")
  public void fly() {
    LOGGER.info("Flying in the controller !!!");
    passengerService.fly("ARR");
  }
}
