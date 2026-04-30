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
    private MotionParameters motionParameters;


    public static Motion of(PhysicalObject objectInMotion,
                    Position initialPosition,
                    Position finalPosition,
                    Direction directionOfMotion,
                    Time initialInstant,
                    Time finalInstant)
    {
        MotionParameters motionParametersNew = MotionParameters.builder()
                        .initialPositionExists(initialPosition != null)
                        .finalPositionExists(finalPosition != null)
                        .directionOfMotionExists(directionOfMotion != null)
                        .initialInstantExists(initialInstant != null)
                        .finalInstantExists(finalInstant != null)
                        .build();
        return Motion.builder()
                        .objectInMotion(objectInMotion)
                        .initialPosition(initialPosition)
                        .finalPosition(finalPosition)
                        .directionOfMotion(directionOfMotion)
                        .initialInstant(initialInstant)
                        .finalInstant(finalInstant)
                        .motionParameters(motionParametersNew)
                        .build();
    }
}
