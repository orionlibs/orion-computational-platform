package com.orion.computationalplatform.simulation.event;

import com.orion.computationalplatform.simulation.core.SimulationCommand;

public record SystemEvent(long timestamp, SimulationCommand command) implements SimulationEvent
{
    @Override
    public int priority()
    {
        return 2;
    }
}
