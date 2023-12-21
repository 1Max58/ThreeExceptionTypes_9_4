package com.example.helicopter;

public class AltitudeTooHighException extends Exception {
    private int altitude;

    public  AltitudeTooHighException(int a) {
        altitude = a;
    }

    @Override
    public String toString() {
        return "Altitude " + altitude + " meters is too high";
    }
}
