package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-10
 *  Time:    下午1:41
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class Pizza {
    String name;
    public Pizza(String name) {
        this.name = name;
    }
    public void prepare(){
        System.out.println("prepare pizza " + name);
        System.out.println("adding " + name);
        System.out.println("rou mian");
        System.out.println("jiao liao");
    }
    public void cook(){
        System.out.println("cooking pizza " + name + " 25 minutes");
    }
    public void cut(){
        System.out.println("cutting pizza " + name);
    }
    public void box(){
        System.out.println("boxing the pizza " + name );
    }
}
