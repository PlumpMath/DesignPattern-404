package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-17
 *  Time:    下午1:41
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class Client {
    public static void main(String[] args) {
        BirdInterface bird = new BigBird();
        bird.yelp();
        bird.fly();

        Duck duck = new Duck();
        duck.quack();
        duck.shakeWings();
        // 将duck适配为bird
        BirdAdapter birdAdapter = new BirdAdapter(duck);
        birdAdapter.yelp();
        birdAdapter.fly();
    }
}
