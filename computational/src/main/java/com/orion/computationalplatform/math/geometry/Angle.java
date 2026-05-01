package com.orion.computationalplatform.math.geometry;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@EqualsAndHashCode
public class Angle
{
    public static final Angle ZERO = Angle.of(0);
    public static final Angle RIGHT_ANGLE = Angle.of(Math.PI / 2.0d);
    protected double angleInRadians;


    public static Angle of(double angleInRadians)
    {
        return Angle.builder()
                        .angleInRadians(angleInRadians)
                        .build();
    }
}
