import java.util.*;

public class  inttobin {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a interger number:");

        int num = sc.nextInt();
        String bin = Integer.toBinaryString(num);
       System.out.println(num + "  ka binary number hota hai: " + bin);

    
    }
}
