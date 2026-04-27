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
}
