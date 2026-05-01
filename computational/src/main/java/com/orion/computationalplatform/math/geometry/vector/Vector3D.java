package com.orion.computationalplatform.math.geometry.vector;

import com.orion.computationalplatform.math.geometry.Angle;
import com.orion.computationalplatform.math.geometry.Axis;
import com.orion.computationalplatform.math.geometry.point.Point3D;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@EqualsAndHashCode
public class Vector3D
{
    protected double x;
    protected double y;
    protected double z;


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


    public double getMagnitude()
    {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }


    public Angle getAngleWithAxis(Axis axis)
    {
        Vector3D axisVector = null;
        if(axis == Axis.X_AXIS)
        {
            axisVector = Vector3D.of(1, 0, 0);
        }
        else if(axis == Axis.Y_AXIS)
        {
            axisVector = Vector3D.of(0, 1, 0);
        }
        else if(axis == Axis.Z_AXIS)
        {
            axisVector = Vector3D.of(0, 0, 1);
        }
        double dotProduct = DotProduct.calculate(this, axisVector);
        return Angle.of(Math.acos(dotProduct / getMagnitude()));
    }
}
