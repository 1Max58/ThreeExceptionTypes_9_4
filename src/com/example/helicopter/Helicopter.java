package com.example.helicopter;

public class Helicopter {
    void fly(int a, int v) throws AltitudeTooLowException, AltitudeTooHighException, VelocityTooHighException {
        if (a < 5) {
            throw new AltitudeTooLowException(a);
        }
        if (a > 5000) {
            throw new AltitudeTooHighException(a);
        }
        if (v > 300) {
            throw new VelocityTooHighException(v);
        }
        System.out.println("Helicopter flies at altitude " + a + " meters with velocity " + v + " km/h");
    }
}
