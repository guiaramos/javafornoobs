import java.util.Random;
import java.util.Scanner;

public class ThirdProblems {

    public static void main(String[] args) {

        String inputAnswer;

        Scanner input = new Scanner(System.in);


        System.out.println("What problems would you like to pratice? (+, -, *, / ");
        inputAnswer = input.nextLine();
        while (true){
            if (inputAnswer.equals("+")||inputAnswer.equals("-")||inputAnswer.equals("*")||inputAnswer.equals("/"))
                break;
            else{
                System.out.println("Invalid input, please enter +, -, *, /)");
                inputAnswer = input.nextLine();
            }
        }

        int counter = 0;
        int num1;
        int num2;
        int answer;
        int answerRemainder;
        int userAnswer;
        int userAnswerRemainder;



        Random ramdom = new Random();
        while (counter !=5){
            if (inputAnswer.equals("+")){
                num1 = ramdom.nextInt(13);
                num2 = ramdom.nextInt(13);
                answer = num1 + num2;
                System.out.println(num1 + " + " + num2);
                userAnswer = input.nextInt();
                if (userAnswer == answer){
                    System.out.println("You got it right!!!");
                    counter++;
                } else
                    System.out.println("You got it wrong!!!");
            } else if (inputAnswer.equals("-")){
                num1 = ramdom.nextInt(13);
                num2 = ramdom.nextInt(13);
                answer = num1 - num2;
                System.out.println(num1 + " - " + num2);
                userAnswer = input.nextInt();
                if (userAnswer == answer) {
                    System.out.println("You got it right!!!");
                    counter++;
                }else
                    System.out.println("You got it wrong!!!");
            }else if (inputAnswer.equals("x")){
                num1 = ramdom.nextInt(13);
                num2 = ramdom.nextInt(13);
                answer = num1 * num2;
                System.out.println(num1 + " * " + num2);
                userAnswer = input.nextInt();
                if (userAnswer == answer) {
                    System.out.println("You got it right!!!");
                    counter++;
                }else
                    System.out.println("You got it wrong!!");
            } else {
                num1 = ramdom.nextInt(13);
                num2 = ramdom.nextInt(13);

                while (num2 == 0){
                    num2 = ramdom.nextInt(13);
                }
                while (num1 < num2){
                    num1 = ramdom.nextInt(13);
                }

                answer = num1 / num2;
                answerRemainder = num1 % num2;

                System.out.println(num1 + " / " + num2);
                userAnswer = input.nextInt();

                System.out.println("Please enter the reminder");
                userAnswerRemainder = input.nextInt();

                if (userAnswer == answer && userAnswerRemainder == answerRemainder){
                    System.out.println("You got it right!!");
                    counter++;
                } else
                    System.out.println("You got it wrong!!");

            }
        }
        System.out.println("Congrats you did it");
        input.close();

    }
}
