package com.orion.computationalplatform.physics.mechanics.classical.kinematcs;

import com.orion.computationalplatform.math.geometry.Direction;
import com.orion.computationalplatform.physics.PhysicalObject;
import com.orion.computationalplatform.physics.position.Position;
import com.orion.computationalplatform.physics.unit.Time;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
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
        Motion motion = Motion.builder()
                        .objectInMotion(objectInMotion)
                        .initialPosition(initialPosition)
                        .finalPosition(finalPosition)
                        .directionOfMotion(directionOfMotion)
                        .initialInstant(initialInstant)
                        .finalInstant(finalInstant)
                        .motionParameters(determineMotionParameters(initialPosition, finalPosition, directionOfMotion, initialInstant, finalInstant))
                        .build();
        motion.calculateAllValuesAndDependencies();
        return motion;
    }


    private static MotionParameters determineMotionParameters(Position initialPosition,
                    Position finalPosition,
                    Direction directionOfMotion,
                    Time initialInstant,
                    Time finalInstant)
    {
        if(initialInstant == null || finalInstant == null)
        {
            throw new IllegalArgumentException("Both the initialInstant and finalInstant are required");
        }
        if(initialPosition == null)
        {
            if(finalPosition == null)
            {
                throw new IllegalArgumentException("Since initialPosition is null, the finalPosition is required");
            }
            if(directionOfMotion == null)
            {
                throw new IllegalArgumentException("Since initialPosition is null, the directionOfMotion is required");
            }
        }
        if(finalPosition == null)
        {
            if(initialPosition == null)
            {
                throw new IllegalArgumentException("Since finalPosition is null, the initialPosition is required");
            }
            if(directionOfMotion == null)
            {
                throw new IllegalArgumentException("Since finalPosition is null, the directionOfMotion is required");
            }
        }
        if(directionOfMotion == null)
        {
            if(initialPosition == null || finalPosition == null)
            {
                throw new IllegalArgumentException("Since directionOfMotion is null, both the initialPosition and finalPosition are required");
            }
        }
        return MotionParameters.builder()
                        .initialPositionExists(initialPosition != null)
                        .finalPositionExists(finalPosition != null)
                        .directionOfMotionExists(directionOfMotion != null)
                        .initialInstantExists(initialInstant != null)
                        .finalInstantExists(finalInstant != null)
                        .build();
    }


    public void calculateAllValuesAndDependencies()
    {
        //private Position initialPosition;
        //private Position finalPosition;
        //private Direction directionOfMotion;
        if(motionParameters.isInitialPositionExists())
        {
            if(motionParameters.isFinalPositionExists())
            {
                //Vector3D displacementVector
                setDirectionOfMotion(Direction.of());
            }
        }
    }
}
