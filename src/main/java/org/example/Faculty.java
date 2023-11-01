package org.example;

public abstract class Faculty extends CourseWithDiscount{

    protected Faculty(double totalHours) {
        super(totalHours);
    }

    @Override
    protected double getCurrentFee(double hoursWorkedInAQuarter){
        return feeAfterDiscount;
    }

    @Override
    protected double getHourlyRate() {
        hourlyRate = 40;
        return hourlyRate;
    }
}
