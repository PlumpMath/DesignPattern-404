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
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class BadDollDecorator extends DollDecorator {
    public BadDollDecorator (Component component) {
        super(component);
    }

    @Override
    public double cost () {
        return 50 + component.cost();
    }

    @Override
    public void display () {
        component.display();
        System.out.print("bad doll decorator 50$  ");
    }
}
