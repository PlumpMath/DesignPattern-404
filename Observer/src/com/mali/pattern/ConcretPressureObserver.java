package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-9
 *  Time:    下午2:31
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class ConcretPressureObserver implements WeatherDataObserver, DisplayBoard {
    private int pressure;
    public ConcretPressureObserver(Subject subject) {
        subject.regist(this);
    }

    @Override
    public void update (int temprature, int pressure, int wind) {
        this.pressure = pressure;
        this.display();
    }

    @Override
    public void display () {
        System.out.println("============================");
        System.out.println("气压布告板：");
        System.out.println("the pressure is " + pressure);
        System.out.println("============================");
    }
}
