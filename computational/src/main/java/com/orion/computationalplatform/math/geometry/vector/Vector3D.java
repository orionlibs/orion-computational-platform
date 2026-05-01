package com.orion.computationalplatform.math.geometry.vector;

import com.orion.computationalplatform.math.geometry.Angle;
import com.orion.computationalplatform.math.geometry.Axis;
import com.orion.computationalplatform.math.geometry.point.Point3D;
import com.orion.computationalplatform.physics.unit.AVector;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class Vector3D implements AVector
{
    public static final Vector3D ZERO = Vector3D.of(0, 0, 0);
    public static final Vector3D UNIT_ON_X_AXIS = Vector3D.of(1, 0, 0);
    public static final Vector3D UNIT_ON_Y_AXIS = Vector3D.of(0, 1, 0);
    public static final Vector3D UNIT_ON_Z_AXIS = Vector3D.of(0, 0, 1);
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
            axisVector = Vector3D.UNIT_ON_X_AXIS;
        }
        else if(axis == Axis.Y_AXIS)
        {
            axisVector = Vector3D.UNIT_ON_Y_AXIS;
        }
        else if(axis == Axis.Z_AXIS)
        {
            axisVector = Vector3D.UNIT_ON_Z_AXIS;
        }
        double dotProduct = DotProduct.calculate(this, axisVector);
        return Angle.of(Math.acos(dotProduct / getMagnitude()));
    }


    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(!(o instanceof Vector3D))
        {
            return false;
        }
        Vector3D other = (Vector3D)o;
        return Double.compare(this.x, other.x) == 0
                        && Double.compare(this.y, other.y) == 0
                        && Double.compare(this.z, other.z) == 0;
    }


    @Override
    public int hashCode()
    {
        final int prime = 59;
        int result = 1;
        result = prime * result + Long.hashCode(Double.doubleToLongBits(this.x));
        result = prime * result + Long.hashCode(Double.doubleToLongBits(this.y));
        result = prime * result + Long.hashCode(Double.doubleToLongBits(this.z));
        return result;
    }
}
