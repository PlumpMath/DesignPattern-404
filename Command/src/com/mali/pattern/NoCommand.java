package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-17
 *  Time:    下午1:19
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class NoCommand implements CommandInteface {
    @Override
    public void execute () {
        //do noting
    }

    @Override
    public void undo () {
        //do nothing
    }

    @Override
    public String toString() {
        return "no command";
    }
}
