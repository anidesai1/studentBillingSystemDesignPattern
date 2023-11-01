package org.example;

public class Main {
    public static void main (String [] args) {
        CourseWithDiscount gradStudent = new Grad(100);
        System.out.println(" The fee for grad course is " + gradStudent.calculateFeeBeforeDiscount(gradStudent.getHourlyRate()));
        System.out.println(" The fee after discount for you as a grad student is " + gradStudent.getCurrentFee(40));

        CourseWithDiscount facultyStudent = new HourlyFaculty(100);
        System.out.println(" The fee for faculty course is " + facultyStudent.calculateFeeBeforeDiscount(facultyStudent.getHourlyRate()));
        System.out.println(" The fee after discount for you as an hourly faculty is " + facultyStudent.getCurrentFee(45));

        CourseWithDiscount tenuredFaculty = new TenuredFaculty(200);
        System.out.println(" The fee for tenured faculty course is " + tenuredFaculty.calculateFeeBeforeDiscount(tenuredFaculty.getHourlyRate()));
        System.out.println(" The fee after discount for as a tenured faculty is " + tenuredFaculty.getCurrentFee(45));

        Student undergrad = new Undergrad(80);
        System.out.println(" The fee for you as an undergrad course is " + undergrad.calculateFeeBeforeDiscount(undergrad.getHourlyRate()));
    }
}