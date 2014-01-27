package com.headfirstlabs.duck.behaviour.fly;

/**
 * @author arkangelofkaos
 */
public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
