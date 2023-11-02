package org.example;

public abstract class Student {

    protected double hourlyRate;
    protected double courseHours;
    protected double gpa;
    GradeDiscountStrategy gradeDiscountStrategy;

    protected Student(double courseHours) {
        this.courseHours = courseHours;
        gradeDiscountStrategy = new NoDiscountStrategy();
    }
    public double getCurrentFee() {
        double fee = calculateFeeBeforeDiscount();
        fee = applyDiscount(fee);
        return fee - gradeDiscount(this.gradeDiscountStrategy, fee);
    }
    public double calculateFeeBeforeDiscount() {
        return this.hourlyRate * this.courseHours;
    }
    public double gradeDiscount(GradeDiscountStrategy gradeDiscountStrategy, double fee) {
         return gradeDiscountStrategy.getDiscount(gpa, fee);
    }
    protected abstract double applyDiscount(double fee);
}