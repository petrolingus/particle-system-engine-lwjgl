package com.petrolingus.pasysegl.engine;

public class SimulationEngine implements Runnable {

    private final Window window;

    private final SimulationLogic simulationLogic;

    public SimulationEngine(SimulationLogic simulationLogic) {
        window = new Window("Particle Simulation", 600, 480, true);
        this.simulationLogic = simulationLogic;
    }

    @Override
    public void run() {
        try {
            init();
            loop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void init() throws Exception {
        window.init();
        simulationLogic.init();
    }

    protected void loop() {
        while (!window.windowShouldClose()) {
            input();
            update(0.0f);
            render();
        }
    }

    protected void input() {
        simulationLogic.input(window);
    }

    protected void update(float interval) {
        simulationLogic.update(interval);
    }

    protected void render() {
        simulationLogic.render(window);
        window.update();
    }
}
