package com.orion.computationalplatform.physics.unit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Length implements Unit
{
    private double length;


    public static Length of(double length)
    {
        return Length.builder()
                        .length(length)
                        .build();
    }


    @Override
    public String getName()
    {
        return "length";
    }


    @Override
    public String getUnitOfMeasurement()
    {
        return "m";
    }


    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(!(o instanceof Length))
        {
            return false;
        }
        Length other = (Length)o;
        return Double.compare(this.length, other.length) == 0;
    }


    @Override
    public int hashCode()
    {
        final int prime = 59;
        int result = 1;
        result = prime * result + Long.hashCode(Double.doubleToLongBits(this.length));
        return result;
    }
}
