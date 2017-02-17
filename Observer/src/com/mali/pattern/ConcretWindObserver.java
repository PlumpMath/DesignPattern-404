package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-9
 *  Time:    下午2:50
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class ConcretWindObserver implements WeatherDataObserver, DisplayBoard {
    private int wind;

    public ConcretWindObserver(Subject subject) {
        subject.regist(this);
    }
    @Override
    public void display () {
        System.out.println("============================");
        System.out.println("风速布告板：");
        System.out.println("current wind is " + wind);
        System.out.println("============================");
    }

    @Override
    public void update (int temprature, int pressure, int wind) {
        this.wind = wind;
        this.display();
    }
}
