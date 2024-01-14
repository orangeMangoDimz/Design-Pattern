package main;

import model.Patient;
import state.DiagnoseState;
import state.PaymentState;
import state.WaitingState;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Dimas");
        while (!(patient.getState() instanceof PaymentState)){
            patient.getState().nextState();
        }

    }
}
