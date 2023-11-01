package org.example;

public abstract class Student {
    String name;
    String studentType;
    String studentAddress;
    double hourlyRate;
    double totalHours;

    protected Student(double totalHours) {
        this.totalHours = totalHours;
    }
    public double getCurrentFee() {
        return this.totalHours * this.hourlyRate;
    }

    public double calculateFeeBeforeDiscount(double hourlyRate) {
        double feeBeforeDiscount = hourlyRate * totalHours;
        return feeBeforeDiscount;
    }

    protected abstract double getHourlyRate();

    public String getName() {
        return name;
    }

    public String getStudentType() {
        return studentType;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public double getTotalHours() {
        return totalHours;
    }
}
