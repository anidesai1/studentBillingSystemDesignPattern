package org.example;

public class Main {
    public static void main (String [] args) {
        Student gradStudent = new Grad(100, 30, 4, new GraduateStrategy());
        System.out.println(" The fee before discount for this grad student is " + gradStudent.calculateFeeBeforeDiscount());
        System.out.println(" The fee after discount for this grad student is " + gradStudent.getCurrentFee());

        Student undergrad = new Undergrad(80, 3.6, new UnderGradStrategy());
        System.out.println(" The fee for this undergrad is " + undergrad.calculateFeeBeforeDiscount());
        System.out.println(" The fee after the grade discount for this undergrad is " + undergrad.getCurrentFee());

        Student facultyStudent = new Faculty(80, 50);
        System.out.println(" The fee before discount for this faculty student is " + facultyStudent.calculateFeeBeforeDiscount());
        System.out.println(" The fee after the grade discount for this faculty student is " + facultyStudent.getCurrentFee());
        //System.out.println(" The fee after discount for this faculty student is " + facultyStudent.applyDiscount(facultyStudent.calculateFeeBeforeDiscount()));

        Student tenuredFaculty = new TenuredFaculty(70, 100);
        System.out.println(" The fee before discount for this tenured faculty is " + tenuredFaculty.calculateFeeBeforeDiscount());
        System.out.println(" The fee after the grade discount for this tenured faculty is " + tenuredFaculty.getCurrentFee());
    }
}