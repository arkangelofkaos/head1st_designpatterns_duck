package com.headfirstlabs.duck.behaviour.quack;

/**
 * @author arkangelofkaos
 */
public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<< SIlence >>");
    }
}
