package Circumference;

import java.util.Scanner;

public class CircumferenceDiameter {
    public static void main(String[] args) {
        int radius;


        Scanner input= new Scanner(System.in);
        System.out.print("Enter radius of a circle: ");
        radius = input.nextInt();


        System.out.printf("Diameter is %d%n", (2*radius));
        System.out.printf("Circumference is %.2f%n", (2*Math.PI));
        System.out.printf("Area is %.2f",(Math.PI)*(radius*radius));





    }
}
