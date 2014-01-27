package com.headfirstlabs.duck;

import com.headfirstlabs.duck.behaviour.fly.FlyNoWay;
import com.headfirstlabs.duck.behaviour.quack.Quack;

/**
 * @author arkangelofkaos
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehaviour = new FlyNoWay();
        this.quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
