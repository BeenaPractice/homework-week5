package homeworkweek5;
/*
Rewrite the student mark sheet programme (From java-homework-week3
programmes) using if else and while loop.
 */

import java.util.Scanner;

public class Programme2 {
    public static void main(String[] args) {
        // scanner declaration input from console
        Scanner scanner = new Scanner(System.in);
        char choice = 'Y';
        while (choice == 'Y') {

            System.out.print("Enter Student Name: ");
            String name = scanner.next();
            System.out.print("Enter Student Roll Number: ");
            int rollNum = scanner.nextInt();
            System.out.print("Enter Marks of Subject Maths: ");
            int mathMarks = scanner.nextInt();
            if (mathMarks < 0 || mathMarks > 100) {
                System.out.println("Invalid input, Marks should between 0 to 100");
                System.out.print("Please enter correct marks: ");
                mathMarks = scanner.nextInt();
            }
            System.out.print("Enter Marks of Subject Science: ");
            int scienceMarks = scanner.nextInt();
            if (scienceMarks < 0 || scienceMarks > 100) {
                System.out.println("Invalid input, Marks should between 0 to 100");
                System.out.print("Please enter correct marks: ");
                scienceMarks = scanner.nextInt();
            }
            System.out.print("Enter Marks of Subject English: ");
            int englishMarks = scanner.nextInt();
            if (englishMarks < 0 || englishMarks > 100) {
                System.out.println("Invalid input, Marks should between 0 to 100");
                System.out.print("Please enter correct marks: ");
                englishMarks = scanner.nextInt();
            }
            int total = sum(mathMarks, scienceMarks, englishMarks);
            int percentage = (total * 100) / 300;
            String result = calculateResult(mathMarks, scienceMarks, englishMarks);
            String grade = calculateGrade(percentage, result);

            printTheMarkSheet(name, rollNum, mathMarks, scienceMarks, englishMarks, total, percentage, result, grade);

            System.out.print("Do you want to print more marksheet(Y/N): ");
            choice = scanner.next().toUpperCase().charAt(0);
            System.out.println(choice);
        }
        scanner.close();
    }

    // calculating the sun
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // calculating the result on subject marks
    public static String calculateResult(int mathMarks, int scienceMarks, int englishMarks) {
        if (mathMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "fail";
        } else {
            return "pass";
        }
    }

    // calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            if (percentage >= 80) {
                grade = "A+";
            } else if (percentage >= 60) {
                grade = "A";
            } else if (percentage >= 50) {
                grade = "B";
            } else if (percentage >= 35) {
                grade = "C";
            }
        } else {
            grade = "-";
        }
        return grade;
    }

    // printing the Mark sheet
    public static void printTheMarkSheet (String name,int rollNum, int mathMarks, int scienceMarks,
                                          int englishMarks, double total, double percentage, String result, String grade){
        System.out.println("-----------------------------");
        System.out.println("|                           |");
        System.out.println("| Mark Sheet                |");
        System.out.println("|___________________________|");
        System.out.println("| Name:" + name + "                  |");
        System.out.println("| Roll No:" + rollNum + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Subjects: Marks           |");
        System.out.println("|___________________________|");
        System.out.println("| Math:" + mathMarks + "                   |");
        System.out.println("| Science:" + scienceMarks + "                |");
        System.out.println("| English:" + englishMarks + "                |");
        System.out.println("|___________________________|");
        System.out.println("| Total:" + total + "             |");
        System.out.println("|___________________________|");
        System.out.println("| Percentage:" + percentage + "           |");
        System.out.println("| Result:" + result + "               |");
        System.out.println("| Grade:" + grade + "                  |");
        System.out.println("|___________________________|");
    }

}
