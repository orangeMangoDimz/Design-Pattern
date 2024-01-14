package state;

import model.Patient;

public abstract class State {
    public Patient patient;

    public State(Patient patient) {
        this.patient = patient;
    }

    public abstract void nextState();
}
