package com.wangguangwu.demo2.compent;

import com.wangguangwu.demo2.mediator.ControlTower;

/**
 * @author wangguangwu
 */
public abstract class Aircraft {

    protected ControlTower controlTower;
    protected String flightNumber;

    protected Aircraft(ControlTower controlTower, String flightNumber) {
        this.controlTower = controlTower;
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public abstract void land();

}
