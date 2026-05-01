package com.orion.computationalplatform.physics.mechanics.classical.kinematcs;

import com.orion.computationalplatform.physics.unit.Scalar;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AverageVelocity implements Scalar
{
    private double averageVelocity;


    public static AverageVelocity of(double averageVelocity)
    {
        return new AverageVelocity(averageVelocity);
    }
}
