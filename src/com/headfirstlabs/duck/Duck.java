package com.headfirstlabs.duck;

import com.headfirstlabs.duck.behaviour.fly.FlyBehaviour;
import com.headfirstlabs.duck.behaviour.quack.QuackBehaviour;

/**
 * Copied from Head First Design Patterns book.
 *
 * @author arkangelofkaos
 */
public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
