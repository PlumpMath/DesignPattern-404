package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-10
 *  Time:    下午1:20
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: 装饰者模式　动态地将责任附加到对象身上．若要扩展，装饰者提供了比继承更有弹性的替代方案
 *  具体的装饰者与被装饰者抽象类有着共同的父接口，因为装饰者需要能代替被装饰者，并且装饰者抽象类需要持有一个被装饰者父接口的引用，
 *  以此完成被装饰者的功能的调用，并在基础上加上附加的责任
 ******************************************************************************/
public class BestDollDecorator extends DollDecorator {
    public BestDollDecorator (Component component) {
        super(component);
    }

    @Override
    public double cost () {
        return 300 + component.cost();
    }


    @Override
    public void display () {
        component.display();
        System.out.print("best doll decorator 300$  ");
    }
}
