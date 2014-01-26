package com.headfirstlabs.duck.behaviour.quack;

/**
 * @author arkangelofkaos
 */
public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
