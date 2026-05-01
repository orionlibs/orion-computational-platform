package com.orion.computationalplatform.physics.mechanics.classical.kinematics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.orion.computationalplatform.TestBase;
import com.orion.computationalplatform.math.geometry.Direction;
import com.orion.computationalplatform.math.geometry.point.Point3D;
import com.orion.computationalplatform.physics.PointMass;
import com.orion.computationalplatform.physics.mechanics.classical.kinematcs.AverageVelocity;
import com.orion.computationalplatform.physics.mechanics.classical.kinematcs.DisplacementVector;
import com.orion.computationalplatform.physics.mechanics.classical.kinematcs.Motion;
import com.orion.computationalplatform.physics.position.Position;
import com.orion.computationalplatform.physics.unit.Time;
import org.junit.jupiter.api.Test;

public class AverageVelocityTest extends TestBase
{
    @Test
    public void calculate()
    {
        AverageVelocity av = AverageVelocity.of(DisplacementVector.of(-19.5d, 0, 0), 3);
        assertEquals(-6.5d, av.calculate());
    }
}
