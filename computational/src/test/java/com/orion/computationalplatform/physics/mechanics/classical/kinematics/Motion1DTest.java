package com.orion.computationalplatform.physics.mechanics.classical.kinematics;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.orion.computationalplatform.TestBase;
import com.orion.computationalplatform.math.geometry.Direction;
import com.orion.computationalplatform.math.geometry.point.Point3D;
import com.orion.computationalplatform.physics.PointMass;
import com.orion.computationalplatform.physics.mechanics.classical.kinematcs.Motion;
import com.orion.computationalplatform.physics.position.Position;
import com.orion.computationalplatform.physics.unit.Time;
import org.junit.jupiter.api.Test;

public class Motion1DTest extends TestBase
{
    @Test
    public void motionOfPointMassIn1D()
    {
        Position ip = Position.of(Point3D.of(0.0d, 0.0d, 0.0d));
        Position fp = Position.of(Point3D.of(5.0d, 0.0d, 0.0d));
        Direction idof = Direction.of(0.0d);
        PointMass pm = PointMass.of("M1", "M1", ip);
        Motion motion = Motion.of(pm, ip, fp, idof, Time.of(0.0d), Time.of(5.0d));
        assertEquals(0.0d, motion.getDirectionOfMotion().getAngleInRadians());
        assertEquals(0.0d, motion.getObjectInMotion().getMass().getMass());
    }
}
