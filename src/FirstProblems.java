import java.util.Scanner;

public class FirstProblems {

    public static void main(String[] args) {

        //Problem 1b

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a side of the square:");
        double side = input.nextDouble();
        double areaSquare = side * side;
        System.out.println("The area of a square when a side of " + side + " is: " + areaSquare);

        //Problem 1b
        System.out.println("Now, let's calculate the area of a rectangle");
        System.out.println("Enter the width value:");
        double width = input.nextDouble();
        System.out.println("Enter the height value:");
        double height = input.nextDouble();
        double areaRectangle = width * height;
        System.out.println("The area of a rectangle of width " + width + " and a height " + height + " is: " + areaRectangle);

        //Problem 1c
        System.out.println("Now, let's calculate the area of triangle");
        System.out.println("Enter the height value:");
        height = input.nextDouble();
        System.out.println("Enter the base value");
        double base = input.nextDouble();
        double areaTriangle = (height * base)/2;
        System.out.println("The area of a a triangle of height " + height + " and base " + base + " is: " + areaTriangle);

        //Problem 2a
        System.out.println("Now, let's convert Fahrenheit to Celsius");
        System.out.println("Please inform the Fahrenheit degree:");
        double degreeFarhrenheit = input.nextInt();
        double degreeCelsius =  (degreeFarhrenheit - 32) * 5/9;
        System.out.println(degreeFarhrenheit + " in Celsius is: " + degreeCelsius);

        //Problem 2b
        System.out.println("Now, let's convert Celsius into Fahrenheit");
        System.out.println("Please inform the Celsius degree;");
        degreeCelsius = input.nextInt();
        degreeFarhrenheit = degreeCelsius * 9/5 + 32;
        System.out.println(degreeCelsius + " in Fahrenheit is: " + degreeFarhrenheit);

        //Problem 3a
        System.out.println("Let's convert inches into centimeters");
        System.out.println("Inform inches value:");
        double inches = input.nextInt();
        double centimeters = inches * 2.54;
        System.out.println(inches + " in centimeters is: " + centimeters);

        //Problem 3b
        System.out.println("Let's covert centimeters into inches");
        System.out.println("Inform centimeters value:");
        centimeters = input.nextInt();
        inches = centimeters * 0.39;
        System.out.println(centimeters + " in centimeters is: " + inches);

        //Results
        double problem1a = areaSquare;
        double problem1b = areaRectangle;
        double problem1c = areaTriangle;
        double problem2a = degreeCelsius;
        double problem2b = degreeFarhrenheit;
        double problem3a = centimeters;
        double problem3b = inches;

        double[][] x = {{problem1a,problem1b,problem1c},{problem2a,problem2b,0},{problem3a,problem3b,0}};

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println("");
        }



    }

}
