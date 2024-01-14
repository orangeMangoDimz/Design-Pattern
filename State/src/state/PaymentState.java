package state;

import model.Patient;

public class PaymentState extends State{
    public PaymentState(Patient patient) {
        super(patient);
        System.out.println("Patient is paying for the bill service");
    }

    @Override
    public void nextState() {
    }
}
