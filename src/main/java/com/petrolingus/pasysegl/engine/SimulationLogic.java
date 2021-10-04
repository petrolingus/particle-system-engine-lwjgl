package com.petrolingus.pasysegl.engine;

public interface SimulationLogic {

    void init() throws Exception;

    void input(Window window);

    void update(float interval);

    void render(Window window);

}
