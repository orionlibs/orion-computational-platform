package com.orion.computationalplatform.math.geometry.point;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Point3D
{
    public static final Point3D ORIGIN = Point3D.of(0, 0, 0);
    private double x;
    private double y;
    private double z;


    public static Point3D of(double x, double y, double z)
    {
        return Point3D.builder()
                        .x(x)
                        .y(y)
                        .z(z)
                        .build();
    }
}
