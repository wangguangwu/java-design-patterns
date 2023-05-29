package com.wangguangwu.demo1;

import com.wangguangwu.demo1.product.Cricket;
import com.wangguangwu.demo1.product.Football;
import com.wangguangwu.demo1.product.Game;

/**
 * @author wangguangwu
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        System.out.println("==============");

        game = new Football();
        game.play();
    }
}
