package com.java.MethodAssignments;

class StudentResult {
    int calculateTotal(int m1, int m2, int m3, int m4, int m5) {
        return m1 + m2 + m3 + m4 + m5;
    }
    double calculateAverage(int total) {
        return total / 5.0;
    }

    String calculateGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 50) {
            return "C";
        } else {
            return "Fail";
        }
    }

    void displayResult(int total, double average, String grade) {
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        StudentResult obj = new StudentResult();
        int total = obj.calculateTotal(85, 78, 92, 88, 77);
        double average = obj.calculateAverage(total);
        String grade = obj.calculateGrade(average);

        obj.displayResult(total, average, grade);
    }
}
