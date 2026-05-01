package com.orion.computationalplatform.physics;

import com.orion.computationalplatform.physics.mechanics.classical.kinematcs.Movable;
import com.orion.computationalplatform.physics.position.Position;
import com.orion.computationalplatform.physics.unit.Mass;
import java.util.UUID;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class PhysicalObject implements Movable
{
    protected UUID id;
    protected String name;
    protected String description;
    protected Position position;
    protected Mass mass;


    public static PhysicalObject of(String name, String description, Position position)
    {
        return PhysicalObject.builder()
                        .id(UUID.randomUUID())
                        .name(name)
                        .description(description)
                        .position(position)
                        .build();
    }


    @Override
    public boolean equals(Object o)
    {
        if(this == o)
        {
            return true;
        }
        if(!(o instanceof PhysicalObject))
        {
            return false;
        }
        PhysicalObject other = (PhysicalObject)o;
        return this.id.toString().equals(other.id.toString())
                        && this.position.equals(other.position)
                        && this.mass.equals(other.mass);
    }


    @Override
    public int hashCode()
    {
        final int prime = 59;
        int result = 1;
        result = prime * result + this.id.toString().hashCode();
        result = prime * result + this.position.hashCode();
        result = prime * result + this.mass.hashCode();
        return result;
    }
}
