package org.example;

public class Grad extends Student {
    private final double hoursWorkedInAQuarter;

    protected Grad(double courseHours, double hoursWorkedInAQuarter, double gpa, GradeDiscountStrategy gradeDiscountStrategy) {
        super(courseHours);
        super.hourlyRate = 40;
        this.gpa = gpa;
        this.hoursWorkedInAQuarter = hoursWorkedInAQuarter;
        this.gradeDiscountStrategy = gradeDiscountStrategy;
    }

    @Override
    protected double applyDiscount(double fee) {
        if (hoursWorkedInAQuarter >= 30) {
            fee = fee - (hoursWorkedInAQuarter * 20);
        }
        gradeDiscountStrategy.getDiscount(gpa, fee);
        return fee;
    }

}