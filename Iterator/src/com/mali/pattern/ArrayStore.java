package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-20
 *  Time:    上午9:53
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class ArrayStore extends Store{
    private ArrayMenu arrayMenu;
    public ArrayStore() {
        arrayMenu = new ArrayMenu();
    }
    public ArrayMenu getArrayMenu() {
        return arrayMenu;
    }

    @Override
    public com.mali.pattern.Iterator getMenuIterator () {
        return arrayMenu.iterator();
    }
}
