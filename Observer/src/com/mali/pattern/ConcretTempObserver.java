package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-9
 *  Time:    下午2:11
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class ConcretTempObserver implements WeatherDataObserver, DisplayBoard{
    private int temp;
    public ConcretTempObserver(Subject subject) {
        subject.regist(this);
    }

    @Override
    public void display () {
        System.out.println("============================");
        System.out.println("温度布告板：");
        System.out.println("current temp is " + temp);
        System.out.println("============================");
    }

    @Override
    public void update (int temprature, int pressure, int wind) {
        this.temp = temprature;
        this.display();
    }
}
