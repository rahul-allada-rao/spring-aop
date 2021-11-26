package arr.learn.springaop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication {

  private static final Logger LOGGER = LoggerFactory.getLogger(SpringAopApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(SpringAopApplication.class, args);
    LOGGER.info("Running my Spring AOP demo with {} ", "passengerExample");
  }
}
