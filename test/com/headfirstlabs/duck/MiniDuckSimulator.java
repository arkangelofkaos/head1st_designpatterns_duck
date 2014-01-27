package com.headfirstlabs.duck;

import com.headfirstlabs.duck.behaviour.fly.FlyRocketPowered;

/**
 * Run harness for simulating ducks and setting behaviour at runtime.
 *
 * @author arkangelofkaos
 */
public class MiniDuckSimulator {
    public static void main(String... ignored) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
