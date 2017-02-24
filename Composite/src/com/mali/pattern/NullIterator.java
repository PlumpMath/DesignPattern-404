package com.mali.pattern;

import java.util.Iterator;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-22
 *  Time:    上午10:18
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext () {
        return false;
    }

    @Override
    public Object next () {
        return null;
    }

    @Override
    public void remove () {
        throw new UnsupportedOperationException();
    }
}
