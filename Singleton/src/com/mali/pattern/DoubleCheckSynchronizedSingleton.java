package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-17
 *  Time:    上午10:27
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class DoubleCheckSynchronizedSingleton {
    // volatile --- read form main memory ,write to main memory
    private volatile static DoubleCheckSynchronizedSingleton doubleCheckSynchronizedSingleton;

    private DoubleCheckSynchronizedSingleton() {}

    public static DoubleCheckSynchronizedSingleton getDoubleCheckSynchronizedSingleton() {
        // double check
        // first, read from main memory and check
        if (doubleCheckSynchronizedSingleton == null) { // main　memory does not exists ; else should not enter the synchronized block
            synchronized (DoubleCheckSynchronizedSingleton.class) { // class object synchronize
                if (doubleCheckSynchronizedSingleton == null) { // check again in the synchronized block , if null ,create
                    doubleCheckSynchronizedSingleton = new DoubleCheckSynchronizedSingleton();
                }
            }
        }
        return doubleCheckSynchronizedSingleton;
    }

    public String toString() {
        return "this is a double check synchronized singleton object";
    }

    public static void main(String[] args) {
        DoubleCheckSynchronizedSingleton doubleCheckSynchronizedSingleton = DoubleCheckSynchronizedSingleton.getDoubleCheckSynchronizedSingleton();
        System.out.println(doubleCheckSynchronizedSingleton);
    }
}
