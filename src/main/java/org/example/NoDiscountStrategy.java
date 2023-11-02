package org.example;

public class NoDiscountStrategy implements GradeDiscountStrategy{
    @Override
    public double getDiscount(double gpa, double fee) {
            return 0;
        }
    }