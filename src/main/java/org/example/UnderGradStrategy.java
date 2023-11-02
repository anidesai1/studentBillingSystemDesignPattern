package org.example;

public class UnderGradStrategy implements GradeDiscountStrategy{
    @Override
    public double getDiscount(double gpa, double fee) {
        if (gpa > 3.5){
            return fee * 0.30;
        } else {
            return 0;
        }
    }
}