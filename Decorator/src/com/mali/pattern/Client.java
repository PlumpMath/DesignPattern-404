package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-10
 *  Time:    下午1:21
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class Client {

    public static void main(String[] args) {
        Component doll = new DollMainComponent();
        System.out.println("the price is " + doll.cost() + "$");
        Component doll1 = new BadDollDecorator(doll);
        System.out.println("the price is " + doll1.cost() + "$");
        System.out.println("=================================");
        Component doll2 = new BestDollDecorator(new GoodDollDecorator(new NormalDollDecorator(new BadDollDecorator(doll))));
        System.out.println("the price is " + doll2.cost() + "$");
        doll2.display();
    }
}
