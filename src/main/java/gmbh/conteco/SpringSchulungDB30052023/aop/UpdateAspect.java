package gmbh.conteco.SpringSchulungDB30052023.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UpdateAspect {

    @After("within(ShoppingCart)")
    public void update(JoinPoint joinPoint){
        ShoppingCart shoppingCart = (ShoppingCart) joinPoint.getTarget();
        shoppingCart.updatePrice();
        shoppingCart.updateCount();
    }
}
