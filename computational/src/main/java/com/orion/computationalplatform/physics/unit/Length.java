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
}
