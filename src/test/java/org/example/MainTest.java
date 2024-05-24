package org.example;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void sum_shouldReturn4_whenCalledWith3And1() {
        int expected = 4;
        int actual = Main.sum(3, 1);
        assertEquals(expected, actual);
    }
    @Test
    void isEven_shouldReturnTrue_whenCalledWith2() {
        boolean expected = true;
        boolean actual = Main.isEven(2);
        assertEquals(expected, actual);
    }
    @Test
    void isEven_shouldReturnFalse_whenCalledWith1() {
        boolean expected = false;
        boolean actual = Main.isEven(1);
        assertEquals(expected, actual);
    }
    @Test
    void prod_shouldReturn6_whenCalledWith3And2() {
        int expected = 6;
        int actual = Main.prod(3, 2);
        assertEquals(expected, actual);
    }
    @Test
    void prod_shouldReturn0_whenCalledWith5And0() {
        int expected = 0;
        int actual = Main.prod(5, 0);
        assertEquals(expected, actual);
    }
    @Test
    void makeUpperCase_shouldReturnUpperCase_whenCalledWithLowerAndUpperCases() {
        String expected = "HELLO WORLD";
        String actual = Main.makeUpperCase("hElLo WoRld");
        assertEquals(expected, actual);
    }
    @Test
    void makeUpperCase_shouldReturnUpperCase_whenCalledWithLowerCase() {
        String expected = "HELLO WORLD";
        String actual = Main.makeUpperCase("hello world");
        assertEquals(expected, actual);
    }
    @Test
    void makeUpperCase_shouldReturnUpperCase_whenCalledWithUpperCase() {
        String expected = "HELLO WORLD";
        String actual = Main.makeUpperCase("HELLO WORLD");
        assertEquals(expected, actual);
    }
    @Test
    void checkPositive_shouldReturnTrue_whenCalled5() {
        boolean expected = true;
        boolean actual = Main.checkPositive(5);
        assertEquals(expected, actual);
    }
    @Test
    void checkPositive_shouldReturnFalse_whenCalledNegativeNumber5() {
        boolean expected = false;
        boolean actual = Main.checkPositive(-5);
        assertEquals(expected, actual);
    }

}