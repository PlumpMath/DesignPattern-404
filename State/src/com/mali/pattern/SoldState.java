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
public class SoldState implements StateInterface {
    private StateMachine stateMachine;

    public SoldState (StateMachine stateMachine) {
        this.stateMachine = stateMachine;
    }

    @Override
    public void insertMoney () {
        System.out.println("please wait the state switched to has no money state!");
    }

    @Override
    public void ejectMoney () {
        System.out.println("please the state switched to has no money state!");
    }

    @Override
    public void turnHandle () {
        System.out.println("please the state switched to has no money state!");
    }

    @Override
    public void dispense () {
        stateMachine.releaseProduct();
        if(stateMachine.getCounts() >0 ) {
            stateMachine.setState(stateMachine.getHasNoMoneyState());
        } else {
            System.out.println("_________no product!!!__________");
            stateMachine.setState(stateMachine.getSoldOutState());
        }

    }
}
