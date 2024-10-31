package com.lamgiathinh.mathutil.core;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MathUtilTest {
    
    public static Object[][] initData() {
        return new Integer[][] {
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 14}
        };
    }
    
    
    
    @ParameterizedTest
    @MethodSource(value = "initData")
    public void testGetFactorialGivenRightArgReturnsWell(int input, long expected) {
        assertEquals(expected, MathUtil.getFactorial(input));
    }
    
    //  Bắt ngoại lệ khi đưa data cà chớn!!!
    
    @Test
    public void testGetFactorialGivenWrongArgThrowException() {
        // xài biểu thức lambda
//        Executable exObject  = new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                MathUtil.getFactorial(-5);
//            }
//            
//        };
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(-5));
    }
}
