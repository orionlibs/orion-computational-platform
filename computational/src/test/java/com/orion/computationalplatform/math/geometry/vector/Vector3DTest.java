package com.orion.computationalplatform.math.geometry.vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.orion.computationalplatform.TestBase;
import com.orion.computationalplatform.math.geometry.Angle;
import com.orion.computationalplatform.math.geometry.Axis;
import org.junit.jupiter.api.Test;

public class Vector3DTest extends TestBase
{
    @Test
    public void getMagnitude()
    {
        assertEquals(1.0d, Vector3D.UNIT_ON_X_AXIS.getMagnitude());
        assertEquals(2.0d * Math.sqrt(3), Vector3D.of(2, 2, 2).getMagnitude());
    }


    @Test
    public void getAngleWithAxis()
    {
        assertEquals(Angle.ZERO, Vector3D.UNIT_ON_X_AXIS.getAngleWithAxis(Axis.X_AXIS));
        assertEquals(Angle.RIGHT_ANGLE, Vector3D.UNIT_ON_X_AXIS.getAngleWithAxis(Axis.Y_AXIS));
    }
}
