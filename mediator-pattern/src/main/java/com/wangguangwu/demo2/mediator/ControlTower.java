package com.wangguangwu.demo2.mediator;

import com.wangguangwu.demo2.compent.Aircraft;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangguangwu
 */
public class ControlTower {

    private final List<Aircraft> aircraftList = new ArrayList<>();

    public void registerAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }

    public void requestToLand(Aircraft aircraft) {
        if (aircraftList.contains(aircraft)) {
            System.out.println("Control Tower: Permission granted to " + aircraft.getFlightNumber());
            aircraft.land();
        } else {
            System.out.println("Control Tower: You are not allowed to land");
        }
    }
}
