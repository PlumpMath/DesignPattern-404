package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-17
 *  Time:    上午10:22
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class SynchronizedSingleton {
    // static singleton object
    private static SynchronizedSingleton synchronizedSingleton;
    // empty constructor
    private SynchronizedSingleton() {}
    // get singleton
    public static synchronized SynchronizedSingleton getSynchronizedSingleton() {
        if (synchronizedSingleton == null) {
            synchronizedSingleton = new SynchronizedSingleton();
        }
        return synchronizedSingleton;
    }
    @Override
    public String toString() {
        return "this is a synchronzied singleton object";
    }

    public static void main(String[] args) {
        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getSynchronizedSingleton();
        System.out.println(synchronizedSingleton);
    }
}
