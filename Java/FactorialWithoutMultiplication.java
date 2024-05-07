import java.util.Scanner;
public class FactorialWithoutMultiplication {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to find it's Factorial :");
        int number = sc.nextInt();

        int fact = 1;

        for(int start = number ; start>=1; start--){
            
            fact = (int)(fact/(1.0/start));
            
        }

        System.out.println("Factorial of "+number+" is : "+fact);
    }
    
}
