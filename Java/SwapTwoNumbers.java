import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value of a : ");
        int a = sc.nextInt();

        System.out.println("Enter Value of b :");
        int b = sc.nextInt();

        System.out.println("Value of First number before swapping is "+a);
        System.out.println("Value of Second number before swapping is "+b);

        int temp=a;
        a=b;
        b=temp;

        System.out.println("Value of First number after swapping is "+a);
        System.out.println("Value of Second number after swapping is "+b);

        
    }
    
}
