package com.mali.pattern;

/******************************************************************************
 *  Name:    mali
 *  Date:    17-2-24
 *  Time:    上午10:21
 *  NetID:   mali
 *  Precept: N/A
 *
 *  Partner Name:    N/A
 *  Partner NetID:   N/A
 *  Partner Precept: N/A
 *
 *  Description: ${DESCRIPTION}
 ******************************************************************************/
public class HasMoneyState implements StateInterface {
    private StateMachine stateMachine;

    public HasMoneyState (StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertMoney () {
        System.out.println("you have already insert money");
    }

    @Override
    public void ejectMoney () {
        System.out.println("eject money....");
        stateMachine.setState(stateMachine.getHasNoMoneyState());
    }

    @Override
    public void turnHandle () {
        System.out.println("turn handle...");
        stateMachine.setState(stateMachine.getSoldState());
    }

    @Override
    public void dispense () {
        System.out.println("should not dispense product");
    }
}
