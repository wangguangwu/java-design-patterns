package com.wangguangwu.mediator.mediator.impl;

import com.wangguangwu.mediator.aircraft.Aircraft;
import com.wangguangwu.mediator.mediator.Mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 空中交通管制塔
 * <p>
 * 这是空中交通管制塔类，负责协调飞行器的起降
 *
 * @author wangguangwu
 */
public class ControlTower implements Mediator {

    private final Map<String, Aircraft> aircraftMap = new HashMap<>();
    private Aircraft landingAircraft = null;

    @Override
    public void registerAircraft(Aircraft aircraft) {
        aircraftMap.put(aircraft.getFlightNumber(), aircraft);
        System.out.printf(
                "注册飞行器：%s%n",
                aircraft.getFlightNumber()
        );
    }

    @Override
    public void requestToLand(Aircraft aircraft) {
        if (landingAircraft == null) {
            landingAircraft = aircraft;
            System.out.printf(
                    "允许降落：%s%n",
                    aircraft.getFlightNumber()
            );
        } else {
            System.out.printf(
                    "等待降落：%s，当前有飞行器正在降落%n",
                    aircraft.getFlightNumber()
            );
            notifyOtherAircraft(aircraft, "等待降落，当前有飞行器正在降落");
        }
    }

    @Override
    public void requestToTakeOff(Aircraft aircraft) {
        if (landingAircraft != null && landingAircraft.equals(aircraft)) {
            landingAircraft = null;
            System.out.printf(
                    "允许起飞：%s%n",
                    aircraft.getFlightNumber()
            );
        } else {
            System.out.printf(
                    "等待起飞：%s，当前有飞行器正在降落%n",
                    aircraft.getFlightNumber()
            );
            notifyOtherAircraft(aircraft, "等待起飞，当前有飞行器正在降落");
        }
    }

    @Override
    public void notifyOtherAircraft(Aircraft aircraft, String message) {
        for (Aircraft other : aircraftMap.values()) {
            if (!other.equals(aircraft)) {
                other.receiveNotification(message);
            }
        }
    }
}
