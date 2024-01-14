package model;

import state.State;
import state.WaitingState;

public class Patient {
    private String name;
    private State state;

    public Patient(String name) {
        this.name = name;
        this.state = new WaitingState(this); //Initial state
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
