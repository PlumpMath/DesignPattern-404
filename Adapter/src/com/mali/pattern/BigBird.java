package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-17
 *  Time:    下午1:37
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class BigBird implements BirdInterface{
    public void fly() {
        System.out.println("i am flying !!!!");
    }

    @Override
    public void yelp () {
        System.out.println("goo goo．．．．");
    }
}
