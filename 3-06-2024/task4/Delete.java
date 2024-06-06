///4. Write a java program to Delete a file 

import java.io.File;

public class Delete {
    public static void main(String[] args) {
        String a = "C:\\Users\\SES-1\\Desktop\\uu\\apna.txt";
        File b = new File(a);
                if (b.delete()) {
                    System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } 
    }

