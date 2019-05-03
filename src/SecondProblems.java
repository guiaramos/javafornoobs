import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SecondProblems {

    public static void main(String[] args) {

        char grade;
        int valueGrade;

        Scanner input = new Scanner(System.in);

        // Asking for input
        System.out.println("Please inform the value for the grade");

        // Check input value
        do {
            System.out.println("The values available are (90, 80, 70, 60, 50)");
            valueGrade = input.nextInt();
            System.out.println(valueGrade);
        } while (!isValid(valueGrade));

        // Processing data
        if (valueGrade >= 90)
            grade = 'A';
        else if (valueGrade >= 80)
            grade = 'B';
        else if (valueGrade >= 70)
            grade = 'C';
        else if (valueGrade >= 60)
            grade = 'D';
        else
            grade = 'F';

        //Final result
        switch (grade){
            case 'A':
                System.out.println("You got an A");
                break;
            case 'B':
                System.out.println("You got an B");
                break;
            case 'C':
                System.out.println("You got an C");
                break;
            case 'D':
                System.out.println("You got an D");
                break;
                default:
                    System.out.println("You got an F");
        }

    }

    // Check input value
    public static boolean isValid(int valueGrade) {
        int[] r = new int[]{ 90, 80, 70, 60, 50 };

        List list = Arrays.asList(r);
        System.out.println(list);
        return list.contains(valueGrade);
    }

}
