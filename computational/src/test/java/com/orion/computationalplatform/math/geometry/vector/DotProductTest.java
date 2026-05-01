package com.orion.computationalplatform.math.geometry.vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.orion.computationalplatform.TestBase;
import org.junit.jupiter.api.Test;

public class DotProductTest extends TestBase
{
    @Test
    public void calculate()
    {
        assertEquals(1.0d, DotProduct.calculate(Vector3D.UNIT_ON_X_AXIS, Vector3D.UNIT_ON_X_AXIS));
        assertEquals(0.0d, DotProduct.calculate(Vector3D.UNIT_ON_X_AXIS, Vector3D.UNIT_ON_Y_AXIS));
    }
}
