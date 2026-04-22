package com.orion.computationalplatform.simulation.core;

import com.orion.computationalplatform.simulation.event.SimulationEvent;

/**
 * Marker interface for events dispatched to every registered entity.
 * Adding new broadcast event types (e.g. PhysicsTickEvent) requires
 * zero changes to GenericSimulationEngine.
 */
public interface BroadcastEvent extends SimulationEvent
{
}
