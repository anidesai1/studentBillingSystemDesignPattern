package org.example;

public abstract class CourseWithDiscount extends Student {
    double discountedAmount;
    double feeAfterDiscount;
    protected CourseWithDiscount(double totalHours) {
        super(totalHours);
    }
    protected double getCurrentFee(double hoursWorkedInAQuarter) {
        return discountedAmount;
    }
}
