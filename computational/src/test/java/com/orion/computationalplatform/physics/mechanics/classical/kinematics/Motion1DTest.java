package com.orion.computationalplatform.physics.mechanics.classical.kinematics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.orion.computationalplatform.TestBase;
import com.orion.computationalplatform.math.geometry.point.Point3D;
import com.orion.computationalplatform.math.number.OrderOfMagnitude;
import com.orion.computationalplatform.physics.PointMass;
import com.orion.computationalplatform.physics.mechanics.classical.kinematcs.InitialDirectionOfMotion;
import com.orion.computationalplatform.physics.position.InitialPosition;
import org.junit.jupiter.api.Test;

public class Motion1DTest extends TestBase
{
    @Test
    public void orderOfMagnitude()
    {
        InitialPosition ip = InitialPosition.builder()
                        .position(Point3D.builder()
                                        .x(0.0d)
                                        .y(0.0d)
                                        .z(0.0d)
                                        .build())
                        .build();
        InitialDirectionOfMotion idof = InitialDirectionOfMotion.builder()
                        .angleInRadians(0.0d)
                        .build();
        PointMass pm = PointMass.builder()
                        .initialPosition(ip)
                        .initialDirectionOfMotion(idof)
                        .build();
        assertEquals(0.0d, pm.getInitialDirectionOfMotion().getAngleInRadians());
    }
}
