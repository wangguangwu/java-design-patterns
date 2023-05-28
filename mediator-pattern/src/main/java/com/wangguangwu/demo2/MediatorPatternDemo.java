package com.wangguangwu.demo2;

import com.wangguangwu.demo2.compent.Aircraft;
import com.wangguangwu.demo2.compent.Airplane;
import com.wangguangwu.demo2.mediator.ControlTower;

/**
 * @author wangguangwu
 */
public class MediatorPatternDemo {

    public static void main(String[] args) {
        ControlTower controlTower = new ControlTower();

        Aircraft airplane1 = new Airplane(controlTower, "AP101");
        controlTower.registerAircraft(airplane1);

        Aircraft airplane2 = new Airplane(controlTower, "AP102");

        controlTower.requestToLand(airplane1);
        controlTower.requestToLand(airplane2);
    }
}
