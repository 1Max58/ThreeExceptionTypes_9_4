package com.example.helicopter;

public class AltitudeTooLowException extends Exception {
    private int altitude;

    public AltitudeTooLowException(int a) {
        altitude = a;
    }

    @Override
    public String toString() {
        return "Altitude " + altitude + " meters is critically low";
    }
}
