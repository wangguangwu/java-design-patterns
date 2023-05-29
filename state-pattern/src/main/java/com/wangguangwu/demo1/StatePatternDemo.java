package com.wangguangwu.demo1;

import com.wangguangwu.demo1.context.Context;
import com.wangguangwu.demo1.state.impl.StarState;
import com.wangguangwu.demo1.state.impl.StopState;

/**
 * @author wangguangwu
 */
public class StatePatternDemo {

    public static void main(String[] args) {
        Context context = new Context();

        StarState starState = new StarState();
        starState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
