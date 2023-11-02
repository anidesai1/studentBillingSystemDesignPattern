package org.example;

public class Undergrad extends Student {
    protected Undergrad(double courseHours, double gpa, GradeDiscountStrategy gradeDiscountStrategy) {
        super(courseHours);
        super.hourlyRate = 35;
        this.gpa = gpa;
        this.gradeDiscountStrategy = gradeDiscountStrategy;
    }

    @Override
    protected double applyDiscount(double fee) {
        return fee;
    }
}