package com.orion.computationalplatform.physics.mechanics.classical.kinematcs;

import com.orion.computationalplatform.math.geometry.Direction;
import com.orion.computationalplatform.physics.PhysicalObject;
import com.orion.computationalplatform.physics.position.Position;
import com.orion.computationalplatform.physics.unit.Time;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Motion
{
    private PhysicalObject objectInMotion;
    private Position initialPosition;
    private Position finalPosition;
    private Direction directionOfMotion;
    private Time initialInstant;
    private Time finalInstant;


    public double getMotionDuration()
    {
        return finalInstant.getInstant() - initialInstant.getInstant();
    }


    public double getDistanceTravelled()
    {
        return 0.0d;
    }
}
