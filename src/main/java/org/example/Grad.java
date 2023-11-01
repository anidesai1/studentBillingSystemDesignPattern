package org.example;

public class Grad extends Student {
    private final double hoursWorkedInAQuarter;

    protected Grad(double courseHours, double hoursWorkedInAQuarter) {
        super(courseHours);
        super.hourlyRate = 40;
        this.hoursWorkedInAQuarter = hoursWorkedInAQuarter;
    }
    @Override
    protected double applyDiscount(double fee) {
        if (hoursWorkedInAQuarter >= 30) {
            fee = fee - (hoursWorkedInAQuarter * 20);
        }
        return fee;
    }
}
