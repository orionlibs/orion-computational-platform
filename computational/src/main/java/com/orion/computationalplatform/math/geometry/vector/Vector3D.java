package com.orion.computationalplatform.math.geometry.vector;

import com.orion.computationalplatform.math.geometry.point.Point3D;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Builder
@Getter
@EqualsAndHashCode
public class Vector3D
{
    private double x;
    private double y;
    private double z;


    public static Vector3D of(double x, double y, double z)
    {
        return Vector3D.builder()
                        .x(x)
                        .y(y)
                        .z(z)
                        .build();
    }


    public static Vector3D of(Point3D startPoint, Point3D endPoint)
    {
        return Vector3D.builder()
                        .x(endPoint.getX() - startPoint.getX())
                        .y(endPoint.getY() - startPoint.getY())
                        .z(endPoint.getZ() - startPoint.getZ())
                        .build();
    }
}
