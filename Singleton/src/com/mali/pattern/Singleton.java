package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-17
 *  Time:    上午10:16
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class Singleton {
    //private constructor
    private Singleton() {}
    //　eager way -- static object
    private static Singleton singleton = new Singleton();

    // return the singleton object
    public static Singleton getSingletonObject() {
        return singleton;
    }
    @Override
    public String toString(){
        return "this is the singleton object!";
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingletonObject();
        System.out.println(singleton);

    }
}
