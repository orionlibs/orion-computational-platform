package com.orion.computationalplatform.math.geometry;

import com.orion.computationalplatform.physics.unit.Scalar;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class Angle implements Scalar
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


    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(!(o instanceof Angle))
        {
            return false;
        }
        Angle other = (Angle)o;
        return Double.compare(this.angleInRadians, other.angleInRadians) == 0;
    }


    @Override
    public int hashCode()
    {
        final int prime = 59;
        int result = 1;
        result = prime * result + Long.hashCode(Double.doubleToLongBits(this.angleInRadians));
        return result;
    }
}
