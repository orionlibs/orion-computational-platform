package com.orion.computationalplatform.simulation.event;

import com.orion.computationalplatform.simulation.core.BroadcastEvent;

public record TickEvent(long timestamp) implements BroadcastEvent
{
    @Override
    public int priority()
    {
        return 0;
    }
}
