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


    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(!(o instanceof Point3D))
        {
            return false;
        }
        Point3D other = (Point3D)o;
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
