package com.headfirstlabs.duck;

import com.headfirstlabs.duck.behaviour.fly.FlyNoWay;
import com.headfirstlabs.duck.behaviour.quack.Quack;

/**
 * @author arkangelofkaos
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        this.setFlyBehaviour(new FlyNoWay());
        this.setQuackBehaviour(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
