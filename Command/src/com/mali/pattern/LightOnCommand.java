package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-17
 *  Time:    下午1:01
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class LightOnCommand implements CommandInteface {
    private Light light;
    public LightOnCommand (Light light) {
        this.light = light;
    }
    @Override
    public void execute () {
        light.on();
    }

    @Override
    public void undo () {
        light.off();
    }

    @Override
    public String toString() {
        return "light off command";
    }


}
