// 1. Write a java program to Append text or string in a file 

import java.io.FileWriter;
import java.io.IOException;

public class appendfile {
     public static void main(String[] args) {
          String   path  =  "gulshan.txt";            // Ensure the path does not have leading spaces
          String  append  =  "Welcome to NSTI Dehradun.\n";   // Fixed string format
        appendTextToFile(path, append);
    }
    public  static  void  appendTextToFile (String path, String append) {
        FileWriter  fileWriter  =  null;
         try  {
               fileWriter  = new FileWriter(path,true); // Open file in append mode
              fileWriter.write(append);
             System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.out.println("Text not appended.");
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close(); // Ensure the file writer is closed
                } catch (IOException e) {
                    e.printStackTrace();
                }}}}
}
