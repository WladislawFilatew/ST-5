package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SqrtTest {
    @Test
    public void sqrt_4() {
        Sqrt sqrt = new Sqrt(4.0);
        assertEquals(sqrt.calc(), 2.0, 0.000001);
    }
}
