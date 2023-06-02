package edu.patterns.singleton;

/**
 * Singleton
 */
public class SingletonLazyHolder {

    private static class Holder {
        private static SingletonLazyHolder instance = new SingletonLazyHolder;

    }

    private SingletonLazyHolder() {

        super();

    }

    public static SingletonLazyHolder getInstance() {

        return Holder.instance;

    }

}