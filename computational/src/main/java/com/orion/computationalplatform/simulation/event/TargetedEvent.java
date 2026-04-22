package com.orion.computationalplatform.simulation.event;

public interface TargetedEvent extends SimulationEvent
{
    String getTargetID();
}
