package org.example;

public class GraduateStrategy implements GradeDiscountStrategy{
    @Override
    public double getDiscount(double gpa, double fee) {
        if (gpa > 3.5) {
            return fee * 0.20;
        } else {
            return 0;
        }
    }
}