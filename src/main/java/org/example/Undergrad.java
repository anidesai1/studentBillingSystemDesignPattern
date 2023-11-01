package org.example;

public class Undergrad extends Student {
    protected Undergrad(double courseHours) {
        super(courseHours);
        super.hourlyRate = 35;
    }

    @Override
    protected double applyDiscount(double fee) {
        return fee;
    }
}
