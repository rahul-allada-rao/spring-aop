package arr.learn.springaop.rest;

import arr.learn.springaop.SpringAopApplication;
import arr.learn.springaop.domain.Passenger;
import arr.learn.springaop.domain.PassengerServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Scanner;

@RestController
public class TravelController {

  private static final Logger LOGGER= LoggerFactory.getLogger(TravelController.class);

  @Autowired
  private Passenger passenger;

  @GetMapping(value = "/fly")
  public void fly(){
    LOGGER.info("Flying in the controller !!!");
    passenger.fly("ARR");
  }
}
