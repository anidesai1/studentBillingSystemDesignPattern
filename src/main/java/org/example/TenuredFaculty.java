package org.example;

public class TenuredFaculty extends Faculty {

    protected TenuredFaculty(double courseHours, double hoursWorkedInAQuarter) {
        super(courseHours, hoursWorkedInAQuarter);
    }
    @Override
    protected double applyDiscount(double fee) {
        fee = super.applyDiscount(fee);
        fee = fee * 0.8;
        return fee;
    }
}
