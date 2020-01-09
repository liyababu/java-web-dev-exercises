package Exercises;

import java.util.Scanner;


public class AreaOfRectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        int length = input.nextInt();
        System.out.println("Enter the width of rectangle:");
        int width = input.nextInt();
        input.close();

        int area = length *width;
        System.out.println("Area of the Rectangle is " +area);

    }
}

