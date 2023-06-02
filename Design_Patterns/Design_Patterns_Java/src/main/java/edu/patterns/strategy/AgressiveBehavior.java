package edu.patterns.strategy;

public class AgressiveBehavior implements Behavior{
    @Override
    public void move() {

        System.out.println("It is moving agressively!");

    }

}
