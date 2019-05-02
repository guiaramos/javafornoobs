import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GettingInput {


    public static void main(String[] args) {
        String firstName;
        String lastName;
        String fullName;
        String userConf = "";
        int userAge = 0;


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your fist name:");
        firstName = input.nextLine();
        System.out.println(firstName + ", please enter your last name:");
        lastName = input.nextLine();
        fullName = firstName + " " + lastName;
        System.out.println(fullName + ", welcome to our system!");

       while (userConf.equals("N") || userConf.isBlank()) {
           System.out.println(fullName + ", can you provide your age?");
           userAge = input.nextInt();
           System.out.println(fullName + ", the age that you provided is: " + userAge);
           System.out.println("is this age correct? type Y for confirm or N to change");
           userConf = input.next();
       }

        System.out.println("Thank you, " + fullName + ", " + userAge);

        File pizzaFile = new File("pizza.txt");
        try (Scanner inputFile = new Scanner(pizzaFile)) {
            while (inputFile.hasNextLine()){
                System.out.println(fullName + ", your pizza is:" + inputFile.nextLine());
            }

        } catch (FileNotFoundException e){
            System.out.println("This File doesn't exist");
        }




    }
}
