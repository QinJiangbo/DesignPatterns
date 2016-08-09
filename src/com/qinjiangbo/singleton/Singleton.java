package com.qinjiangbo.singleton;

/**
 * Created by IntelliJ IDEA.
 * Date: 9/13/15 4:23 PM
 * Author: Richard
 */
public class Singleton {

    public static Singleton instance;

    /**
     * 防止直接实例化
     */
    private Singleton() {

    }

    /**
     * 双重检查锁
     * @return
     */
    public static Singleton getSingletonInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
