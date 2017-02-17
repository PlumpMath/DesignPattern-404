package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-17
 *  Time:    下午1:47
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class BirdAdapter implements BirdInterface {
    private Duck duck;
    public BirdAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void fly () {
        for(int i = 0; i < 3; i++) {
            duck.shakeWings();
        }
    }

    @Override
    public void yelp () {
        duck.quack();
    }
}
