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
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class DuckTrue extends Duck {

    public DuckTrue() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new QuackWithElectricty();
    }
    public void display () {
        System.out.println("real duck showing!!!");
    }
}
