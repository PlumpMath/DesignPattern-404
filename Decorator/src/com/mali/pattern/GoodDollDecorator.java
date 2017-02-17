package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-10
 *  Time:    下午1:19
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class GoodDollDecorator extends DollDecorator {
    public GoodDollDecorator (Component component) {
        super(component);
    }

    @Override
    public double cost () {
        return 200 + component.cost();
    }

    @Override
    public void display () {
        component.display();
        System.out.print("good doll decorator 200$  ");
    }


}
