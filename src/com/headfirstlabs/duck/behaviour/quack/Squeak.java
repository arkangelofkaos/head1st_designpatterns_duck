package com.headfirstlabs.duck.behaviour.quack;

/**
 * @author arkangelofkaos
 */
public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
