package com.orion.computationalplatform.physics.mechanics.classical.kinematcs;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MotionParameters
{
    private boolean initialPositionExists;
    private boolean finalPositionExists;
    private boolean directionOfMotionExists;
    private boolean initialInstantExists;
    private boolean finalInstantExists;


    public static MotionParameters of(boolean initialPositionExists,
                    boolean finalPositionExists,
                    boolean directionOfMotionExists,
                    boolean initialInstantExists,
                    boolean finalInstantExists)
    {
        return MotionParameters.builder()
                        .initialPositionExists(initialPositionExists)
                        .finalPositionExists(finalPositionExists)
                        .directionOfMotionExists(directionOfMotionExists)
                        .initialInstantExists(initialInstantExists)
                        .finalInstantExists(finalInstantExists)
                        .build();
    }
}
