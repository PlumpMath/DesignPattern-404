package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-10
 *  Time:    下午1:09
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class DollMainComponent implements Component {
    @Override
    public double cost () {
        return 1000;
    }

    @Override
    public void display () {
        System.out.print("main doll 1000$  ");
    }
}
