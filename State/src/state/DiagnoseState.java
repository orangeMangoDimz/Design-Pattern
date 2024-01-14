package state;

import model.Patient;

public class DiagnoseState extends State{
    public DiagnoseState(Patient patient) {
        super(patient);
        System.out.println("Patient is diagnosing ...");
    }

    @Override
    public void nextState() {
        patient.setState(new PaymentState(patient));
    }
}
