package com.orion.computationalplatform.physics.mechanics.classical.kinematcs;

import com.orion.computationalplatform.physics.unit.Scalar;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DistanceTravelled implements Scalar
{
    private AverageVelocity averageVelocity;
    private double averageVelocityValue;
    private double travelDuration;


    public static DistanceTravelled of(AverageVelocity averageVelocity, double travelDuration)
    {
        return new DistanceTravelled(averageVelocity, 0.0d, travelDuration);
    }


    public static DistanceTravelled of(double averageVelocityValue, double travelDuration)
    {
        return new DistanceTravelled(null, averageVelocityValue, travelDuration);
    }


    public double calculate()
    {
        return averageVelocity.getAverageVelocity() * travelDuration;
    }
}
