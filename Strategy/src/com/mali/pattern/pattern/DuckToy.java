package com.mali.pattern.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-9
 *  Time:    下午1:50
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class DuckToy extends Duck {

    public DuckToy() {
        this.flyBehavior = new FlyWithElectricity();
        this.quackBehavior = new QuackWithElectricty();
    }
    public void display () {
        System.out.println("toy duck show!!!");
    }
}
