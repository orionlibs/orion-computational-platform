package com.orion.computationalplatform.physics.mechanics.classical.kinematcs;

import com.orion.computationalplatform.math.geometry.Angle;
import com.orion.computationalplatform.math.geometry.Axis;
import com.orion.computationalplatform.physics.unit.Scalar;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class AverageVelocityWithDisplacementVector extends AverageVelocity
{
    private DisplacementVector displacement;
    private double travelDuration;


    public AverageVelocityWithDisplacementVector(DisplacementVector displacement, double travelDuration)
    {
        super(0);
        this.displacement = displacement;
        this.travelDuration = travelDuration;
        setAverageVelocity(calculate());
    }


    public static AverageVelocityWithDisplacementVector of(DisplacementVector displacement, double travelDuration)
    {
        return new AverageVelocityWithDisplacementVector(displacement, travelDuration);
    }


    public double calculate()
    {
        Angle direction = displacement.getAngleWithAxis(Axis.X_AXIS);
        return (displacement.getMagnitude() * Math.cos(direction.getAngleInRadians())) / travelDuration;
    }
}
