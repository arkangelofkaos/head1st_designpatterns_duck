package com.headfirstlabs.duck.behaviour.fly;

/**
 * @author arkangelofkaos
 */
public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
