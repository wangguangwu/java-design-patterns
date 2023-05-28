package com.wangguangwu.demo2.compent;

/**
 * @author wangguangwu
 */
public abstract class Aircraft {

    protected String flightNumber;

    protected Aircraft(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public abstract void land();

}
