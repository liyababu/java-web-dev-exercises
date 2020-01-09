package org.launchcode.java.studios;

import java.util.Scanner;

public class areaofacircle {

    public static void main(String[] args){
        try(Scanner input = new Scanner(System.in)) {
            Double radius = 0.0;
            do {
                System.out.print("Enter the radius");
                radius = input.nextDouble();
            } while (radius <= 0.0);
            System.out.println("The area of circle iof radius " +radius+ "is: " + Circle.getArea(radius));
        }catch(Exception e){
            System.err.println(("Stop inputting garbage"));

            }
        }
    }

