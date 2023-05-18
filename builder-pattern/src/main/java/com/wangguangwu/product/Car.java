package com.wangguangwu.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wangguangwu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    private String engine;
    private int wheels;
    private String color;

}
