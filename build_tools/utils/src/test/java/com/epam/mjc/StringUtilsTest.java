package com.epam.mjc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    private static StringUtils stringUtils;

    @BeforeEach
    void init() {
        stringUtils = new StringUtils();
    }

    @Test
    void checkPositive_positive() {
        assertTrue(stringUtils.isPositive("5"));
    }

    @Test
    void checkPositive_negative() {
        var stringUtils = new StringUtils();
        assertFalse(stringUtils.isPositive("-5"));
    }
}
