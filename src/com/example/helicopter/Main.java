package com.example.helicopter;

public class Main {
    public static void main(String[] args) {
        Helicopter helicopter = new Helicopter();
        try {
            helicopter.fly(3, 200);
        }
        catch (AltitudeTooLowException | AltitudeTooHighException | VelocityTooHighException e) {
            System.out.println(e);
        }
    }
}
