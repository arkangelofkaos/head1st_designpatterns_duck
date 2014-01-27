package com.headfirstlabs.duck;

import com.headfirstlabs.duck.behaviour.fly.FlyWithWings;
import com.headfirstlabs.duck.behaviour.quack.Quack;

/**
 * @author arkangelofkaos
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        this.setQuackBehaviour(new Quack());
        this.setFlyBehaviour(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
