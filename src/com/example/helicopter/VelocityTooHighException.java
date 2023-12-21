package com.example.helicopter;

public class VelocityTooHighException extends Exception {
    private int velocity;

    public VelocityTooHighException(int v) {
        velocity = v;
    }

    @Override
    public String toString() {
        return "Velocity " + velocity + " km/h is too high";
    }
}
