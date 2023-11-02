package org.example;

public class Faculty extends Student {
    private final double hoursWorkedInAQuarter;

    protected Faculty(double courseHours, double hoursWorkedInAQuarter) {
        super(courseHours);
        super.hourlyRate = 45;
        this.hoursWorkedInAQuarter = hoursWorkedInAQuarter;
    }

    @Override
    protected double applyDiscount(double fee) {
        if (hoursWorkedInAQuarter >= 40) {
            fee = fee - (hoursWorkedInAQuarter * 20);
        }
        return fee;
    }
}