package com.orion.computationalplatform.physics.mechanics.classical.kinematics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.orion.computationalplatform.TestBase;
import com.orion.computationalplatform.physics.mechanics.classical.kinematcs.AverageVelocity;
import com.orion.computationalplatform.physics.mechanics.classical.kinematcs.AverageVelocityWithDisplacementVector;
import com.orion.computationalplatform.physics.mechanics.classical.kinematcs.DisplacementVector;
import com.orion.computationalplatform.physics.mechanics.classical.kinematcs.DistanceTravelled;
import org.junit.jupiter.api.Test;

public class DistanceTravelledTest extends TestBase
{
    @Test
    public void calculate()
    {
        AverageVelocity av = AverageVelocity.of(18000.0d / 3600.0d);
        DistanceTravelled dt = DistanceTravelled.of(av, 150 * 60);
        assertEquals(45000, dt.calculate());
    }
}
