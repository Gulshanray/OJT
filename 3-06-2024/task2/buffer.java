// Write a java program to Read content from file using BufferedReader

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class buffer {
    public static void main(String args[]){
        String path= "gulshan.txt";
        try(BufferedReader br= new BufferedReader(new FileReader((path)))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch( IOException e){
            e.printStackTrace();
        }}
        
    }
  

