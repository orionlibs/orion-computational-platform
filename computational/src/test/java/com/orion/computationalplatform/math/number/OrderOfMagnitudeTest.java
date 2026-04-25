package com.orion.computationalplatform.math.number;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.orion.computationalplatform.TestBase;
import org.junit.jupiter.api.Test;

public class OrderOfMagnitudeTest extends TestBase
{
    @Test
    public void orderOfMagnitude()
    {
        assertEquals(3, OrderOfMagnitude.get(4567));
        assertEquals(3, OrderOfMagnitude.get(4567.1234567));
        assertEquals(3, OrderOfMagnitude.get(-4567.1234567d));
        assertEquals(0, OrderOfMagnitude.get(3.14d));
        assertEquals(16, OrderOfMagnitude.get(3.14159e16));
        assertEquals(16, OrderOfMagnitude.get(-3.14159e16));
    }
}
