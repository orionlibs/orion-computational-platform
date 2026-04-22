package com.orion.computationalplatform.simulation.event;

public record TickEvent(long timestamp) implements SimulationEvent
{
    @Override
    public int priority()
    {
        return 0;
    }
}
