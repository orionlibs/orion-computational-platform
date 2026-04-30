package com.orion.computationalplatform.physics.mechanics.classical.kinematcs;

import com.orion.computationalplatform.math.geometry.vector.Vector3D;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MotionSolver
{
    private Motion motion;


    public static MotionSolver of(Motion motion)
    {
        return MotionSolver.builder()
                        .motion(motion)
                        .build();
    }


    public double getDistanceTravelled()
    {
        return 0.0d;
    }


    public Vector3D getDisplacement()
    {
        return Vector3D.of(motion.getInitialPosition().getPosition(), motion.getFinalPosition().getPosition());
    }
}
