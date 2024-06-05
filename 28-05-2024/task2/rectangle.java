/*
Create a class named Rectangle with attributes length and breadth (or width) and methods to calculate and display the area. 
Use the Scanner class to get user input for the rectangle's dimensions.
 (Area of Rectangle = Length*Breadth)
*/

import java.util.*;

class gulshan{

    public double addi(double lenght, double breath){
        return  lenght * breath;
    } 
}
public class  rectangle{
    public static void main(String args[]){
           Scanner a = new Scanner(System.in);
            gulshan a1= new   gulshan();

            System.out.print("Enter length: ");
          double len = a.nextDouble();

        System.out.print("Enter breadth: ");
        double bre = a.nextDouble();

         double z = a1.addi(len,bre);
         System.out.println("Area of Rectangle : " + z);
    }
}