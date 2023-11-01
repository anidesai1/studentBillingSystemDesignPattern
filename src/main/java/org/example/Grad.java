package org.example;

public class Grad extends CourseWithDiscount{
    protected Grad(double totalHours) {
        super(totalHours);
    }

    @Override
    protected double getCurrentFee(double hoursWorkedInAQuarter) {
        if (hoursWorkedInAQuarter >= 30) {
            discountedAmount = hoursWorkedInAQuarter * 10;
            feeAfterDiscount = (getHourlyRate() * getTotalHours())- discountedAmount;
        }
        else {
            feeAfterDiscount = getTotalHours() * getHourlyRate();
        }
        return feeAfterDiscount;
    }

    @Override
    protected double getHourlyRate() {
        hourlyRate = 35;
        return hourlyRate;
    }
}
