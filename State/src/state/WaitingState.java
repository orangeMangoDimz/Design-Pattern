package state;

import model.Patient;

public class WaitingState extends State{

    public WaitingState(Patient patient) {
        super(patient);
        System.out.println("Patient is waiting to be diagnosed");
    }

    @Override
    public void nextState() {
        patient.setState(new DiagnoseState(patient));
    }
}
