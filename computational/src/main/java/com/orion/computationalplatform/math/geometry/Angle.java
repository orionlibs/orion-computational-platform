package com.orion.computationalplatform.math.geometry;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@EqualsAndHashCode
public class Angle
{
    protected double angleInRadians;


    public static Angle of(double angleInRadians)
    {
        return Angle.builder()
                        .angleInRadians(angleInRadians)
                        .build();
    }
}
