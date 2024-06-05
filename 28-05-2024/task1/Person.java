import java.util.*;
/*
 Create a class named Person with attributes name and age.
 Use Scanner to get user input for a name and age, then create a 
Person object and greet the user by name and age.
*/
      class gulshan{
      gulshan(String name, int age) {
        System.out.println("My name is"+ name +" and my age is"+age+".");

    }}
    public class Person{
    public static void main(String[] args) {
         Scanner a = new Scanner(System.in);
          String   name =  a.nextLine();
         int age = a.nextInt();
        gulshan  b = new   gulshan(name, age);
    }}

