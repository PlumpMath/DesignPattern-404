package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-17
 *  Time:    下午2:53
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class MakeCoffe extends MakeCaffineDrink {
    @Override
    public void brew () {
        System.out.println("冲泡咖啡！");
    }

    @Override
    public void addCondiment () {
        System.out.println("添加牛奶！");
    }
}
