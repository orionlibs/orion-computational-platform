package com.orion.computationalplatform.physics.mechanics.classical.kinematcs;

import com.orion.computationalplatform.physics.unit.Scalar;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AverageSpeed implements Scalar
{
    private double distanceTravelled;
    private double travelDuration;


    public double calculate()
    {
        return distanceTravelled / travelDuration;
    }
}
