package com.orion.computationalplatform.physics.unit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Time implements Unit
{
    private double instant;


    public static Time of(double instant)
    {
        return Time.builder()
                        .instant(instant)
                        .build();
    }


    @Override
    public String getName()
    {
        return "Time";
    }


    @Override
    public String getUnitOfMeasurement()
    {
        return "s";
    }


    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(!(o instanceof Time))
        {
            return false;
        }
        Time other = (Time)o;
        return Double.compare(this.instant, other.instant) == 0;
    }


    @Override
    public int hashCode()
    {
        final int prime = 59;
        int result = 1;
        result = prime * result + Long.hashCode(Double.doubleToLongBits(this.instant));
        return result;
    }
}
