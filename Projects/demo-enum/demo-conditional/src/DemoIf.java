public class DemoIf {
    public static void main(String[] args) throws Exception {

        double salary = 15000d;

        if (salary > 14000) {
            System.out.println("salary is > 14000.");
        }

        if (salary >= 15000) {
            System.out.println("salary is >= 15000");
        }

        if (salary <= 17000) {
            System.out.println("salary is < 17000");
        }

        if (salary <= 15000) {
            System.out.println("salary <= 15000");
        }

        char grade = 'A';

        if (grade == 'A') {
            // System.out.println("grade = A");

        } else if (grade == 'B') {
            // System.out.println("grade = B");

        } else if (grade == 'C') {
            // System.out.println("grade = C");

        } else if (grade == 'D') {
            // System.out.println("grade = D");

        } else if (grade == 'E') {
            // System.out.println("grade = E");

        } else {
            // System.out.println("grade = F");
        }

        int score = 70;

        if (score >= 90) {
            grade = 'A';
            System.out.println("My Exam grade is: " + grade);
        } else if (score >= 80) {
            grade = 'B';
            System.out.println("My Exam grade is: " + grade);
        } else if (score >= 70) {
            grade = 'C';
            System.out.println("My Exam grade is: " + grade);
        } else if (score >= 60) {
            grade = 'D';
            System.out.println("My Exam grade is: " + grade);
        } else {
            System.out.println("I fail the Exam! NOOOO!");
        }

        int score2 = 60;

        if (score >= 50 && score2 >= 50) {
            System.out.println("My Exam score is: " + ((score + score2) / 2));
        } else {
            System.out.println("I fail the Exam! NOOOO!");
        }
    }
}
