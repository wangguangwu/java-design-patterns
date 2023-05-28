package com.wangguangwu.demo2.compent;

import com.wangguangwu.demo2.mediator.ControlTower;

/**
 * @author wangguangwu
 */
public class Airplane extends Aircraft {

    public Airplane(ControlTower controlTower, String flightNumber) {
        super(controlTower, flightNumber);
    }

    @Override
    public void land() {
        System.out.println("Airplane " + flightNumber + " is landing");
    }
}
