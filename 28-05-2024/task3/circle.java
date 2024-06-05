/*

3. Create a class named Circle with an attribute radius and a method to calculate the area. 
Use Scanner to get user input for the circle's radius (Area of Circle = πr*r) 
*/

import java.util.*;

class Mohit {
    public double cir(double radius) {
        return Math.PI * radius * radius;
    }
}


public class circle {

    public  static  void  main(String[] args) {
         
         Scanner  a= new Scanner(System.in);
         Mohit b  = new Mohit();
         System.out.print("Enter the radius of the circle :");
        
 double  r = a.nextDouble();
double area = b.cir(r);

        

        System.out.println("Area of the circle with radius " + r + " is: " + area);
    }
}
