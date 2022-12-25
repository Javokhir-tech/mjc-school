package com.epam.mjc;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public boolean isPositive(String str) {
        return NumberUtils.toInt(str) > 0;
    }

    public static void main(String[] args) {
        var stringUtils = new StringUtils();
        System.out.println(stringUtils.isPositive("2"));
        System.out.println(stringUtils.isPositive("-2"));
    }
}
