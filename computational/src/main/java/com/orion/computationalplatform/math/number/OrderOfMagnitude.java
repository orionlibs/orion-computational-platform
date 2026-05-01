package com.orion.computationalplatform.math.number;

import com.orion.computationalplatform.physics.unit.Scalar;

public class OrderOfMagnitude implements Scalar
{
    public static int get(Number x)
    {
        long y = Math.abs(x.longValue());
        int orderOfMagnitude = 0;
        while(y > 10L)
        {
            y /= 10L;
            orderOfMagnitude++;
        }
        return orderOfMagnitude;
    }
}
