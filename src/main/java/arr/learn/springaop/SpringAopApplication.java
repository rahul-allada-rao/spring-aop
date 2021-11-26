package arr.learn.springaop;

import arr.learn.springaop.domain.Passenger;
import arr.learn.springaop.domain.PassengerServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"arr.learn.springaop"})
public class SpringAopApplication {
	private static final Logger LOGGER= LoggerFactory.getLogger(SpringAopApplication.class);

//	@Autowired
//	private static Passenger passenger;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
		LOGGER.info("Running my Spring AOP demo with {} ", "passengerExample");

//		passenger.fly("ARR");
	}

}
