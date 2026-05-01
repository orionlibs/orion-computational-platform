package com.orion.computationalplatform.physics.mechanics.classical.kinematics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.orion.computationalplatform.TestBase;
import com.orion.computationalplatform.physics.mechanics.classical.kinematcs.AverageVelocityWithDisplacementVector;
import com.orion.computationalplatform.physics.mechanics.classical.kinematcs.DisplacementVector;
import org.junit.jupiter.api.Test;

public class AverageVelocityWithDisplacementVectorTest extends TestBase
{
    @Test
    public void calculate()
    {
        AverageVelocityWithDisplacementVector av = AverageVelocityWithDisplacementVector.of(DisplacementVector.of(-19.5d, 0, 0), 3);
        assertEquals(-6.5d, av.calculate());
    }
}
