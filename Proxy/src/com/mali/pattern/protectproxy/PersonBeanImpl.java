package com.mali.pattern.protectproxy;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-27
 *  Time:    上午10:10
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class PersonBeanImpl implements PersonBean {
    public PersonBeanImpl (String name) {
        this.name = name;
    }

    private String name;
    private int rate;
    @Override
    public String getName () {
        return name;
    }

    @Override
    public void setName (String name) {
        this.name = name;
    }

    @Override
    public int getRate () {
        return rate;
    }

    @Override
    public void setRate (int rate) {
        this.rate = rate;
    }
}
