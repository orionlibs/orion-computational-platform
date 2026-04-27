package com.orion.computationalplatform.physics.position;

import com.orion.computationalplatform.math.geometry.point.Point3D;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
public class Position
{
    protected Point3D position;
}
