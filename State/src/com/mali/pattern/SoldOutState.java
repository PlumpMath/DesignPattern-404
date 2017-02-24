package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-24
 *  Time:    上午10:20
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class SoldOutState implements StateInterface {
    private StateMachine stateMachine;

    public SoldOutState (StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertMoney () {
        System.out.println("sold out ! do not insert money!");
    }

    @Override
    public void ejectMoney () {
        System.out.println("sold out ! you have no money inserted!");
    }

    @Override
    public void turnHandle () {
        System.out.println("sold out ! turn handle has no effect");

    }

    @Override
    public void dispense () {
        System.out.println("sold out ! can not disepense!");
    }
}
