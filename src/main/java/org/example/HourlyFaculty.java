package org.example;

public class HourlyFaculty extends Faculty {
    protected HourlyFaculty(double totalHours) {
        super(totalHours);
    }
    @Override
    protected double getCurrentFee(double hoursWorkedInAQuarter) {
        if (hoursWorkedInAQuarter >= 40) {
            feeAfterDiscount = (getHourlyRate() * getTotalHours())-  (hoursWorkedInAQuarter * 20);
        }
        else {
            feeAfterDiscount = getTotalHours() * getHourlyRate();
        }
        return feeAfterDiscount;
    }
}
