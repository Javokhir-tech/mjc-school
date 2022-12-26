package com.epam.core;

import com.epam.mjc.StringUtils;

public class Utils {

    public static boolean isAllPositives(String... strings) {
        for (var str : strings) {
            if (!StringUtils.isPositive(str)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(StringUtils.isPositive("2"));
    }
}
