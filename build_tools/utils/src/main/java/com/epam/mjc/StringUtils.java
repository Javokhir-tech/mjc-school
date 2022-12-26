package com.epam.mjc;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    public static boolean isPositive(String str) {
        return NumberUtils.toInt(str) > 0;
    }
}
