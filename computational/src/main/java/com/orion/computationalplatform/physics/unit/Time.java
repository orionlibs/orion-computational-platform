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
}
