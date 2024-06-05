
public class factorial {
    public static void main(String[] args) {
        int num = 4;
        int factorial = 1;
        for (int i = 1; i <= num; i++) { //        //Using for loop
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}
