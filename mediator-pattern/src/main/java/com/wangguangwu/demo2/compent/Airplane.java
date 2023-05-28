package com.wangguangwu.demo2.compent;

/**
 * @author wangguangwu
 */
public class Airplane extends Aircraft {

    public Airplane(String flightNumber) {
        super(flightNumber);
    }

    @Override
    public void land() {
        System.out.println("Airplane " + flightNumber + " is landing");
    }
}
