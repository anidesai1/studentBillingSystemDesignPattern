package org.example;

public class TenuredFaculty extends Faculty{
    private double hoursWorkedInAQuarter;

    protected TenuredFaculty(double totalHours) {
        super(totalHours);
    }
    @Override
    protected double getCurrentFee(double hoursWorkedInAQuarter) {
        if (hoursWorkedInAQuarter >= 40) {
            double additionalDiscount = hoursWorkedInAQuarter * 20;
            feeAfterDiscount = (getHourlyRate() * getTotalHours()) - (hoursWorkedInAQuarter * 30);
        }
        else {
            feeAfterDiscount = getTotalHours() * getHourlyRate();
        }
        return feeAfterDiscount;
    }
}
