package com.orion.computationalplatform.physics;

import com.orion.computationalplatform.physics.position.Position;
import com.orion.computationalplatform.physics.unit.Mass;
import java.util.UUID;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class PointMass extends PhysicalObject
{
    public static PointMass of(Position position)
    {
        return PointMass.builder()
                        .id(UUID.randomUUID())
                        .name(UUID.randomUUID().toString())
                        .description("")
                        .position(position)
                        .build();
    }


    public static PointMass of(String name, String description, Position position)
    {
        return PointMass.builder()
                        .id(UUID.randomUUID())
                        .name(name)
                        .description(description)
                        .position(position)
                        .build();
    }


    public Mass getMass()
    {
        if(mass == null)
        {
            this.mass = Mass.of(0);
        }
        return mass;
    }


    @Override
    public boolean equals(Object o)
    {
        return super.equals(o);
    }


    @Override
    public int hashCode()
    {
        return super.hashCode();
    }
}
