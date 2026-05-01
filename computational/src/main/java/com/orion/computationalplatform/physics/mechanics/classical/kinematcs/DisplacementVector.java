package com.orion.computationalplatform.physics.mechanics.classical.kinematcs;

import com.orion.computationalplatform.math.geometry.point.Point3D;
import com.orion.computationalplatform.math.geometry.vector.Vector3D;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@EqualsAndHashCode
public class DisplacementVector extends Vector3D
{
    public static DisplacementVector of(double x, double y, double z)
    {
        return DisplacementVector.builder()
                        .x(x)
                        .y(y)
                        .z(z)
                        .build();
    }


    public static DisplacementVector of(Point3D startPoint, Point3D endPoint)
    {
        return DisplacementVector.builder()
                        .x(endPoint.getX() - startPoint.getX())
                        .y(endPoint.getY() - startPoint.getY())
                        .z(endPoint.getZ() - startPoint.getZ())
                        .build();
    }
}
