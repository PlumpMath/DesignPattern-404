package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-9
 *  Time:    下午2:41
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${观察者模式：定义了对象之间的一对多依赖关系，这样一来，一个对象的状态变化，会使得所有依赖它的对象的得到通知，并更新}
 *  这种是推信息的例子，推信息不需要主动去ｇｅｔ信息，而是update的时候将参数传过来
 *  主动拉的例子，需要将get变化信息的方法抽象放到subject中，同时观察者需要持有主题的引用，如此可以调用主题的方法，主动去查询信息
 ******************************************************************************/
public class Simulator {
    public static void main(String[] args) {
        WeatherDataSubject subject = new WeatherDataSubject();
        WeatherDataObserver observer = new ConcretPressureObserver(subject);
        subject.measureChanged();
        System.out.println("-----changed --------------");
        WeatherDataObserver observer1 = new ConcretTempObserver(subject);
        WeatherDataObserver observer2 = new ConcretWindObserver(subject);
        subject.measureChanged();
        System.out.println("-----changed --------------");
        System.out.println("-----changed --------------");
        subject.measureChanged();
    }
}
