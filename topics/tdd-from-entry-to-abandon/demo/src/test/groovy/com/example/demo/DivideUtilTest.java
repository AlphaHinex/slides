package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DivideUtilTest {

    @Test
    void testDivide() {
        Assertions.assertEquals(2, DivideUtil.divide(6, 3));
        Assertions.assertEquals(2.5, DivideUtil.divide(5, 2));
        Assertions.assertEquals(11.0/3.0, DivideUtil.divide(11, 3));
        Assertions.assertThrows(RuntimeException.class, () -> DivideUtil.divide(11, 0));
    }

}
