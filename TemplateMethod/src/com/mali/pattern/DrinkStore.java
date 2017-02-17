package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-17
 *  Time:    下午2:53
 *  NetID:   mali
 *  Precept: N/An
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${模板方法模式在一个方法中定义了算法的骨架，并将一些步骤的实现延迟到子类.
 *                  模板方法使得子类在不改变算法结构的情况下，重新定义算法中的某些步骤}
 ******************************************************************************/
public class DrinkStore {
    public static void main(String[] args) {
        //制作饮料
        MakeCaffineDrink makeTea = new MakeTea();
        makeTea.makeDrink();
        System.out.println("---------");
        MakeCaffineDrink makeCoffe = new MakeCoffe();
        makeCoffe.makeDrink();
    }
}
