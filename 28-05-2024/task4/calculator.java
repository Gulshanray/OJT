// 4. Create a class name Calculator which will add, subtract, multiply and divide. 

 import java.util.*;
class math{
    public int addi(int a, int b){
        return a+b;
    }


       public int multi(int a, int b){
        return a*b;
    }

       public int subtract(int a, int b){
        return a-b;
    }

       public int divide(int a, int b){
        return a/b;
    }
}
public class calculator{
    public static void main(String args[]){

         Scanner  a= new Scanner(System.in);

        // Adddi
        math a1= new math();
         System.out.println(" Enter your first number: ");
         int x = a.nextInt();
        System.out.println(" Enter your   second  number: ");
         int y = a.nextInt();
        int z = a1.addi(x,y);
        System.out.println( " The sum of the two numbers is: " + z);


/// Multi
          math a2= new math();
         int x1=10;
         int y1 = 23;
        int z1 = a1.multi(x1,y1);
        System.out.println( "The product of 10 and 23 is:" + z1);


//subtract
         math a3= new math();
         int x2=100;
         int y2 = 23;
        int z2 = a1.subtract(x2,y2);
        System.out.println(    " The difference between 10 and 23 is:" + z2);


// divide 
         math a4= new math();
         int x3=100;
         int y3 = 2;
        int z3 = a1.divide(x3,y3);
        System.out.println(" The quotient of 10 divided by 23 is: " + z3);




    }
}