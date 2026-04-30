package com.orion.computationalplatform.math.geometry.vector;

public class DotProduct
{
    public static double calculate(Vector3D u, Vector3D v)
    {
        return (u.getX() * v.getX()) + (u.getY() * v.getY()) + (u.getZ() * v.getZ());
    }
}
