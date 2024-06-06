/// 5. Write a java program to Read a file line by line 


package task5;

import java.io.File;

import java.util.Scanner;

public class Read {
    public static void main(String args[]){
       try{
             File  a = new File("C:\\Users\\SES-1\\Desktop\\OJT  assignment\\3-06-2024\\task1\\gulshan.txt");
             Scanner b = new Scanner(a);
             while(b.hasNextLine()){
                String d= b.nextLine();
                System.out.println(d);
             }

         }catch(Exception y){
            System.out.println(" error");

         }
    }
}
