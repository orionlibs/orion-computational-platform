package com.orion.computationalplatform.math.number;

public class OrderOfMagnitude
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
