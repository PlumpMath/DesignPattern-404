package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-17
 *  Time:    下午2:52
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class MakeTea extends MakeCaffineDrink  {
    @Override
    public void brew () {
        System.out.println("冲泡茶叶！");
    }

    @Override
    public void addCondiment () {
        System.out.println("添加柠檬！");
    }
}
