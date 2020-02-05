package com.spartaglobal.cob;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArmstrongNumbersTests {
    ArmstrongNumbers armstrongNumbers = new ArmstrongNumbers();

    @Test
    void testToCheckArmstrongNumberSingleDigit(){
        assertEquals(8, armstrongNumbers.checkArmstrongNumbers(2));
    }

    @Test
    void testToCheckArmstrongNumberIsTrue(){
        assertEquals(8+27, armstrongNumbers.checkArmstrongNumbers(23));
    }

}
