package com.orion.computationalplatform.physics.unit;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Mass implements Unit
{
    private double mass;


    public static Mass of(double mass)
    {
        return Mass.builder()
                        .mass(mass)
                        .build();
    }


    @Override
    public String getName()
    {
        return "Mass";
    }


    @Override
    public String getUnitOfMeasurement()
    {
        return "Kg";
    }


    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(!(o instanceof Mass))
        {
            return false;
        }
        Mass other = (Mass)o;
        return Double.compare(this.mass, other.mass) == 0;
    }


    @Override
    public int hashCode()
    {
        final int prime = 59;
        int result = 1;
        result = prime * result + Long.hashCode(Double.doubleToLongBits(this.mass));
        return result;
    }
}
