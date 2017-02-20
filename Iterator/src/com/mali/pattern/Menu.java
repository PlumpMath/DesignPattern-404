package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-20
 *  Time:    下午12:56
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public abstract class Menu implements com.mali.pattern.Iterable{
    //　该方法的实现可以改为通过Menu实现Iterable接口来实现
    abstract com.mali.pattern.Iterator getMenuIterator();
}
