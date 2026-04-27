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
}
