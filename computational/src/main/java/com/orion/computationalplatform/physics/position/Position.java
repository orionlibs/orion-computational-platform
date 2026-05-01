package com.orion.computationalplatform.physics.position;

import com.orion.computationalplatform.math.geometry.point.Point3D;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class Position
{
    protected Point3D position;


    public static Position of(Point3D position)
    {
        return Position.builder()
                        .position(position)
                        .build();
    }


    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(!(o instanceof Position))
        {
            return false;
        }
        Position other = (Position)o;
        return this.position.equals(other);
    }


    @Override
    public int hashCode()
    {
        final int prime = 59;
        int result = 1;
        result = prime * result + this.position.hashCode();
        return result;
    }
}
