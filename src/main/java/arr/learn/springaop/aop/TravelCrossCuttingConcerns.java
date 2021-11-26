package arr.learn.springaop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TravelCrossCuttingConcerns {

  private static final Logger LOGGER = LoggerFactory.getLogger(TravelCrossCuttingConcerns.class);

  @Before("execution(* arr.learn.springaop.domain.PassengerServiceImpl.fly(..))")
  public void getSecurityClearance(JoinPoint joinPoint) {
    LOGGER.info("Get Security clearance !!! {}", joinPoint.getArgs());
  }
}
