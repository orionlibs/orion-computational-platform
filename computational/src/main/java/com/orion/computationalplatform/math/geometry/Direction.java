package com.orion.computationalplatform.math.geometry;

import lombok.experimental.SuperBuilder;

@SuperBuilder
public class Direction extends Angle
{
    public static Direction of(double angleInRadians)
    {
        return Direction.builder()
                        .angleInRadians(angleInRadians)
                        .build();
    }


    public static Direction of(Angle angle)
    {
        return Direction.builder()
                        .angleInRadians(angle.getAngleInRadians())
                        .build();
    }


    @Override
    public boolean equals(Object o)
    {
        return super.equals(o);
    }


    @Override
    public int hashCode()
    {
        return super.hashCode();
    }
}
