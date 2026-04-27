package com.orion.computationalplatform.physics;

import com.orion.computationalplatform.physics.mechanics.classical.kinematcs.InitialDirectionOfMotion;
import com.orion.computationalplatform.physics.mechanics.classical.kinematcs.Movable;
import com.orion.computationalplatform.physics.position.InitialPosition;
import com.orion.computationalplatform.physics.unit.Mass;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class PhysicalObject implements Movable
{
    protected InitialPosition initialPosition;
    protected InitialDirectionOfMotion initialDirectionOfMotion;
    protected Mass mass;
}
