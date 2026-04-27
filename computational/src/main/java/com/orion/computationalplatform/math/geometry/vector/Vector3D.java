package com.orion.computationalplatform.math.geometry.vector;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
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
}
