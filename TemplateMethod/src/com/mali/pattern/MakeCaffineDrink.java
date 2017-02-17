package com.mali.pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-17
 *  Time:    下午2:44
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public abstract class MakeCaffineDrink {

    // final method　防止被修改的算法骨架
    public final void makeDrink() {
        boilWater();
        brew();
        if (needCondiment()) {
            addCondiment(); //添加了狗子
        }
        pourToCup();
    }

    public void boilWater() {
        System.out.println("烧水");
    }

    public void pourToCup() {
        System.out.println("倒入杯中");
    }

    public abstract void brew(); //　抽象的冲泡方法

    public abstract void addCondiment(); // 抽象的添加调料方法

    public boolean needCondiment() {
        System.out.println("do you need condinements?(yes/no)");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        try {
            if(bf.readLine().startsWith("y")){
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}
