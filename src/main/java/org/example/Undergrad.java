package org.example;

public class Undergrad extends Student {
    protected Undergrad(double totalHours) {
        super(totalHours);
    }
    @Override
    protected double getHourlyRate() {
        hourlyRate = 30;
        return hourlyRate;
    }
}
