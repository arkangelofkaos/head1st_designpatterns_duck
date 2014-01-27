package com.headfirstlabs.duck;

/**
 * @author arkangelofkaos
 */
public class MiniDuckSimulator {
    public static void main(String... ignored) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
