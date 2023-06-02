package edu.patterns;

import edu.patterns.facade.Facade;
import edu.patterns.singleton.SingletonEager;
import edu.patterns.singleton.SingletonLazy;
import edu.patterns.singleton.SingletonLazyHolder;
import edu.patterns.strategy.*;

public class Test {

    public static void main(String[] args) {

        // Singleton Tests

        //// Lazy Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        //// Eager Singleton
        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);

        eager = SingletonEager.getInstance();
        System.out.println(eager);

        //// Lazy Holder Singleton
        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        holder = SingletonLazyHolder.getInstance();
        System.out.println(holder);

        // Strategy Tests

        //// Normal Behavior
        Behavior normal = new NormalBehavior();

        //// Defensive Behavior
        Behavior defensive = new DefensiveBehavior();

        //// Agerssive Behavior
        Behavior agresive = new AgressiveBehavior();

        Robot robot = new Robot();
        robot.setStrategy(normal);
        
        robot.move();

        // Facade Tests

        Facade facade = new Facade();

        facade.migrateClient("Gabriel", "123456789");

    }
}
