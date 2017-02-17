package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-10
 *  Time:    下午1:18
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class NormalDollDecorator extends DollDecorator {
    public NormalDollDecorator (Component component) {
        super(component);
    }

    @Override
    public double cost () {
        return 100 + component.cost();
    }

    @Override
    public void display () {
        component.display();
        System.out.print("normal doll decorator 100$  ");
    }
}
