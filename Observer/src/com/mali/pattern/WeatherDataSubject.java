package com.mali.pattern;

import java.util.ArrayList;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-9
 *  Time:    下午2:24
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class WeatherDataSubject implements Subject {

    private ArrayList<WeatherDataObserver> observerList = new ArrayList<WeatherDataObserver>();
    public void regist(WeatherDataObserver observer) {
        observerList.add(observer);
    }

    public void unregist(WeatherDataObserver observer) {
        int index = observerList.indexOf(observer);
        observerList.remove(index);
    }

    public void notifyObservers(){
        for (WeatherDataObserver observer : observerList) {
            observer.update(this.getTemperature(), this.getPressure(), this.getWind());
        }
    }

    public int getTemperature() {
        return (int) (Math.random()*30);
    }

    public int getPressure() {
        return (int) (Math.random()*10);
    }

    public int getWind() {
        return (int) (Math.random()*5);
    }

    public void measureChanged(){
        notifyObservers();
    }


}
