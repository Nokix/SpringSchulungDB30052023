package gmbh.conteco.SpringSchulungDB30052023.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimerAspect {
    @Around("@annotation(TimeMe)")
    public Object measureExecutionTime(
            ProceedingJoinPoint joinPoint
    ) throws Throwable {
        long start = System.nanoTime();
        Object result = joinPoint.proceed();
        long time = System.nanoTime() - start;
        System.out.println(
                joinPoint.getSignature().getName()
                + " is executed in "
                + time
                + " nanoseconds."
        );
        return result;
    }
}
