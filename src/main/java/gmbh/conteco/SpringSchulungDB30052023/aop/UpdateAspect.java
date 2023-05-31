package gmbh.conteco.SpringSchulungDB30052023.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UpdateAspect {

    @Pointcut("within(ShoppingCart)")
    public void shoppingCartMethods() {

    }

    @After("shoppingCartMethods()")
    public void update(JoinPoint joinPoint){
        ShoppingCart shoppingCart = (ShoppingCart) joinPoint.getTarget();
        shoppingCart.updatePrice();
        shoppingCart.updateCount();
    }

    @Around("shoppingCartMethods() && args(item)")
    public Object checkNoCola(ProceedingJoinPoint joinPoint, Item item) throws Throwable {

        if (item.getName().equals("Sprite")) {
            throw new Exception("Keine Sprite erlaubt!");
        }
        return joinPoint.proceed();
    }
}
