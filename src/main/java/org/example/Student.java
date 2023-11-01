package org.example;

public abstract class Student {

    protected double hourlyRate;
    protected double courseHours;

    protected Student(double courseHours) {
        this.courseHours = courseHours;
    }
    public double getCurrentFee() {
        double fee = calculateFeeBeforeDiscount();
        fee = applyDiscount(fee);
        return fee;
    }
    public double calculateFeeBeforeDiscount() {
        return this.hourlyRate * this.courseHours;
    }
    protected abstract double applyDiscount(double fee);
}
