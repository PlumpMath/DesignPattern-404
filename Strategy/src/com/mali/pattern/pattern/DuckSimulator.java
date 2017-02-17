package com.mali.pattern.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-9
 *  Time:    下午1:51
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *　
 *  Description: ${策略模式：定义了算法簇，分别封装起来，使他们可以相互替换．此模式使得算法的变化独立于使用算法的客户端}
 ******************************************************************************/
public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck1 = new DuckToy();
        duck1.display();
        duck1.performQuakBehavior();
        duck1.performFlyBehavior();
        duck1.setFlyBehavior(new FlyWithWings());
        duck1.performFlyBehavior();
        System.out.println("============");
        Duck duck2 = new DuckTrue();
        duck2.display();
    }
}
