package com.petrolingus.pasysegl.simulation;

import com.petrolingus.pasysegl.engine.SimulationEngine;
import com.petrolingus.pasysegl.engine.SimulationLogic;

public class Main {

    public static void main(String[] args) {
        SimulationLogic simulationLogic = new DummySimulationLogic();
        SimulationEngine simulationEngine = new SimulationEngine(simulationLogic);
        simulationEngine.run();
    }
}
