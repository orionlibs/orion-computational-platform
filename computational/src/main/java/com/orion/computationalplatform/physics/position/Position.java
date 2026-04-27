package com.orion.computationalplatform.physics.position;

import com.orion.computationalplatform.math.geometry.point.Point3D;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@EqualsAndHashCode
public class Position
{
    protected Point3D position;


    public static Position of(Point3D position)
    {
        return Position.builder()
                        .position(position)
                        .build();
    }
}
