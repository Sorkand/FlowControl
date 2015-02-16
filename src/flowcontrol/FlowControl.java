package flowcontrol;

import java.util.Scanner;

/**
 *
 * @author sofyashipova
 */
public class FlowControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        oddEvenTester();
        getPersonDrivingData();
        getPersonAgeOfMajorityData();
        studentTestManager();
        studentGradeManager();

    }

    private static void oddEvenTester() {
        System.out.println("Even Detector");
        Scanner input = new Scanner(System.in);

        int i;
        do {
            System.out.println("Please enter an integer number: ");
            i = input.nextInt();

            if (isEven(i)) {
                System.out.println("is an even number.");
            } else {
                System.out.println("is an odd number.");
            }

        } while (i != 0);

    }

    private static void getPersonDrivingData() {
        System.out.println("Driver Test");
        Scanner input = new Scanner(System.in);

        String name;
        int i;
        do {
            System.out.println("Please enter your name: ");
            name = input.next();

            System.out.println("Please enter your age: ");
            i = input.nextInt();

            String msg = checkDrivingEligibility(i) ? "Congratulations, " + name + ": you are able to apply for a driver’s license!" : "Sorry, " + name + ", you are not able to drive yet.";
            System.out.println(msg);

        } while (i != 0);

    }

    private static void studentTestManager() {
        System.out.println("Student Grades\n--------");
        Scanner input = new Scanner(System.in);
        String name;

        do {
            System.out.println("Which grade do you want to know?");
            name = input.next();
            switch (name) {
                case "Helen":
                    studentGradeIfThenElse("Helen", 97);
                    break;
                case "Jane":
                    studentGradeIfThenElse("Jane", 87);
                    break;
                case "Joe":
                    studentGradeIfThenElse("Joe", 78);
                    break;
                case "Lindsay":
                    studentGradeIfThenElse("Lindsay", 75);
                    break;
                case "Peter":
                    studentGradeIfThenElse("Peter", 82);
                    break;
                case "Zeeshan":
                    studentGradeIfThenElse("Zeeshan", 91);
                    break;
                case "Stephan":
                    studentGradeIfThenElse("Stephan", 68);
                    break;
                case "All":
                    studentGradeIfThenElse("Helen", 97);
                    studentGradeIfThenElse("Jane", 87);
                    studentGradeIfThenElse("Joe", 78);
                    studentGradeIfThenElse("Lindsay", 75);
                    studentGradeIfThenElse("Peter", 82);
                    studentGradeIfThenElse("Zeeshan", 91);
                    studentGradeIfThenElse("Stephan", 68);
                    break;
            }
        } while (!name.equals("No"));
    }

    private static void studentGradeManager() {
        System.out.println("Student Grade Message\n--------");
        Scanner input = new Scanner(System.in);
        String name;

        do {
            System.out.println("Which message do you want to see?");
            name = input.next();
            switch (name) {
                case "Helen":
                    printGradeMessage("Helen", "A");
                    break;
                case "Jane":
                    printGradeMessage("Jane", "A");
                    break;
                case "Joe":
                    printGradeMessage("Joe", "C-");
                    break;
                case "Lindsay":
                    printGradeMessage("Lindsay", "F");
                    break;
                case "Peter":
                    printGradeMessage("Peter", "C");
                    break;
                case "Zeeshan":
                    studentGradeIfThenElse("Zeeshan", 91);
                    break;
                case "Stephan":
                    printGradeMessage("Stephan", "B");
                    break;
                case "All":
                    printGradeMessage("Helen", "A");
                    printGradeMessage("Jane", "A");
                    printGradeMessage("Joe", "C-");
                    printGradeMessage("Zeeshan", "B");
                    printGradeMessage("Lindsay", "F");
                    printGradeMessage("Peter", "C");
                    printGradeMessage("Stephan", "B");
                    break;
                case "Surprise":
                    printGradeMessage("Mr. Lawrence", "Vodka");
                    break;
                default:
                    System.out.println("Are you inadequate?");
                    break;
            }
        } while (!name.equals("No"));
    }

    private static void printGradeMessage(String studentName, String grade) {
        for (int i1 = 0; i1 < 1; i1++) {
            System.out.print(studentName + "   ");
            for (int i2 = 0; i2 < 1; i2++) {
                System.out.print(grade);
                switch (grade) {
                    case "A":
                        System.out.print("   Excellent work!\n");
                        break;
                    case "B":
                    case "C":
                        System.out.print("   Well done\n");
                        break;
                    case "C-":
                        System.out.print("   Passing grade\n");
                        break;
                    case "D":
                        System.out.print("   Pass, but additional work required\n");
                        break;
                    case "F":
                        System.out.print("   Failing grade\n");
                        break;
                    default:
                        System.out.print("   Invalid grade (loser!)\n");

                }
            }
        }
    }

    private static void studentGradeIfThenElse(String studentName, int mark) {
        for (int i1 = 0; i1 < 1; i1++) {
            System.out.print(studentName + ":    ");
            for (int i2 = 0; i2 < 1; i2++) {
                System.out.print(mark);
                if (mark < 50) {
                    System.out.print("  F\n");
                } else if (mark < 65 && mark >= 50) {
                    System.out.print("  D\n");
                } else if (mark < 70 && mark >= 65) {
                    System.out.print("  C-\n");
                } else if (mark < 80 && mark >= 70) {
                    System.out.print("  C\n");
                } else if (mark < 90 && mark >= 80) {
                    System.out.print("  B\n");
                } else if (mark < 100 && mark >= 90) {
                    System.out.print("  A\n");
                } else {
                    System.out.println("   You are an idiot.");
                }
            }
        }
    }

    private static void getPersonAgeOfMajorityData() {
        System.out.println("Are You Adult?");
        Scanner input = new Scanner(System.in);

        String name;
        int i;
        String province;
        do {
            System.out.println("Please enter your name: ");
            name = input.next();

            System.out.println("And your age: ");
            i = input.nextInt();

            System.out.println("And your province of residence: ");
            province = input.next();

            String msg = checkAgeOfMajorityEligibility(i, province) ? "Congratulations, " + name + ": you are legally considered an adult!" : "Sorry, " + name + ", you are not yet consider an adult under the law.";
            System.out.println(msg);

        } while (i != 0);

    }

    private static boolean checkAgeOfMajorityEligibility(int age, String provinceCode) {
        if (provinceCode.equals("AB") || provinceCode.equals("SK")
                || provinceCode.equals("MN") || provinceCode.equals("PQ") || provinceCode.equals("NB") || provinceCode.equals("MN")) {
            return age >= 18;
        } else {
            return age >= 19;
        }
    }

    private static boolean checkDrivingEligibility(int age) {
        return age >= 16;
    }

    private static boolean isEven(int value) {
        return (value % 2) == 0;
    }

}
