package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-10
 *  Time:    下午1:54
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class WastonPizzaStyle extends Pizza {

    public WastonPizzaStyle (String name) {
        super(name);
    }

    @Override
    public void cut () {
        System.out.println("cut it to square " + this.name);
    }
}
