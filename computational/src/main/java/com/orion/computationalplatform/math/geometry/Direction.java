package com.orion.computationalplatform.math.geometry;

import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@EqualsAndHashCode
public class Direction extends Angle
{
    public static Direction of(double angleInRadians)
    {
        return Direction.builder()
                        .angleInRadians(angleInRadians)
                        .build();
    }
}
