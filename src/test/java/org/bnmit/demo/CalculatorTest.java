package org.bnmit.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test // ✅ PASS
    public void testAdd() {
        assertEquals(10, c.add(5, 5));
    }

    @Test // ✅ PASS
    public void testSubtract() {
        assertEquals(2, c.subtract(5, 3));
    }
}
