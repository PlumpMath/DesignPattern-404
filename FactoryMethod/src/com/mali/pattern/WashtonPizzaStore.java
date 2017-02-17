package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-10
 *  Time:    下午1:53
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: 工厂方法模式　定义一个创建对象的方法，但是由子类决定具体实例化哪个对象．
 *  工厂方法模式让类的实例化推迟到子类
 ******************************************************************************/
public class WashtonPizzaStore extends PizzaStore {
    public static void main(String[] args) {
        PizzaStore store = new WashtonPizzaStore();
        Pizza pizza = store.orderPizza("cheese");
        System.out.println("--------------");
        store.orderPizza("niunai");
    }


    protected Pizza createPizza (String type) {
        //　即使同一个区域可能有同类型的pizza并且其创建方式也不太一样，
        //　这里可能根据type创建不同的pizza类型　
        // 用if else来创建　如果是cheese 那创建 WastonCheesePizza
        //                      meat 　那创建 WastonMeatPizza
        // 这些不同的类型里面可以自定义重写prepare cook方法，实现不同的创建方式
            return new WastonPizzaStyle("washton " + type + " pizza");
    }
}
