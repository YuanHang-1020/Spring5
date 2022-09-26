package com.reactor;

import java.util.Observable;

/**
 * @Author hang.yuan
 * @Date 2022/9/26 10:21
 * @Description
 * @Ref
 */
public class ObserverTest extends Observable {

    public static void main(String[] args) {

        ObserverTest observerTest = new ObserverTest();

        observerTest.addObserver((o, arg) -> {
            System.out.println("发生变化");
        });

        observerTest.addObserver((o, arg) -> {
            System.out.println("手动被观察者通知，准备发生变化");
        });
        observerTest.setChanged();           // 数据变化
        observerTest.notifyObservers();      // 通知

    }

}
