
package BMI;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        double weight;
        double height;
        double bmi;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in Kg:");

        weight = input.nextDouble();

        System.out.print("Enter height in metres:");

        height = input.nextDouble();

        bmi = weight/(height*height);

        System.out.printf("Your bmi is %.2f%n" , bmi);
        if (bmi  < 18.5){
            System.out.print("You are underweight");
        }
        if (bmi  >= 30){
            System.out.print("You are obese");
        }

    }
}