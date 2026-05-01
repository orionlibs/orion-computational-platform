package com.orion.computationalplatform.physics.mechanics.classical.kinematcs;

import com.orion.computationalplatform.math.geometry.Angle;
import com.orion.computationalplatform.math.geometry.Axis;
import com.orion.computationalplatform.physics.unit.AVector;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AverageVelocity implements AVector
{
    private DisplacementVector displacement;
    private double travelDuration;


    public static AverageVelocity of(DisplacementVector displacement, double travelDuration)
    {
        return new AverageVelocity(displacement, travelDuration);
    }


    public double calculate()
    {
        Angle direction = displacement.getAngleWithAxis(Axis.X_AXIS);
        return (displacement.getMagnitude() * Math.cos(direction.getAngleInRadians())) / travelDuration;
    }
}
