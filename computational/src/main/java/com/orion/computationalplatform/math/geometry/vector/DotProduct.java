package com.orion.computationalplatform.math.geometry.vector;

import com.orion.computationalplatform.physics.unit.Scalar;

public class DotProduct implements Scalar
{
    public static double calculate(Vector3D u, Vector3D v)
    {
        return (u.getX() * v.getX()) + (u.getY() * v.getY()) + (u.getZ() * v.getZ());
    }
}
