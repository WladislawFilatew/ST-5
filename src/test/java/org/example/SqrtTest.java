package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {
    @Test
    public void sqrt_4() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(sqrt.calc(), 2.0, 0.000001);
    }

    @Test
    public void sqrt_1024() {
        Sqrt sqrt = new Sqrt(1024);
        assertEquals(sqrt.calc(), 32, 0.000001);
    }

    @Test
    public void sqrt_1() {
        Sqrt sqrt = new Sqrt(1);
        assertEquals(sqrt.calc(), 1, 0.000001);
    }

    @Test
    public void sqrt_99() {
        Sqrt sqrt = new Sqrt(99);
        assertEquals(sqrt.calc(), Math.sqrt(99), 0.000001);
    }

    @Test
    public void sqrt_10000() {
        Sqrt sqrt = new Sqrt(10000);
        assertEquals(sqrt.calc(), Math.sqrt(10000), 0.000001);
    }

    @Test(timeout = 1000)
    public void sqrt_timout() {
        Sqrt sqrt = new Sqrt(9);
        assertEquals(sqrt.calc(), 3, 0.000001);
    }

    @Test
    public void sqrt_negativ() {
        Sqrt sqrt = new Sqrt(9);
        assertNotEquals(sqrt.calc(), 9, 0.000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sqrt_exception_negativ() {
        Sqrt sqrt = new Sqrt(-9);
        assertNotEquals(sqrt.calc(), 9, 0.000001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sqrt_exception_0() {
        Sqrt sqrt = new Sqrt(0);
        assertNotEquals(sqrt.calc(), 9, 0.000001);
    }

    @Test
    public void sqrt_12() {
        Sqrt sqrt = new Sqrt(12);
        assertEquals(sqrt.calc(), Math.sqrt(12), 0.000001);
    }

    @Test
    public void sqrt_1999() {
        Sqrt sqrt = new Sqrt(1999);
        assertEquals(sqrt.calc(), Math.sqrt(1999), 0.000001);
    }

    @Test
    public void sqrt_3() {
        Sqrt sqrt = new Sqrt(3);
        assertEquals(sqrt.calc(), Math.sqrt(3), 0.000001);
    }

    @Test
    public void sqrt_2() {
        Sqrt sqrt = new Sqrt(2);
        assertEquals(sqrt.calc(), Math.sqrt(2), 0.000001);
    }

}
