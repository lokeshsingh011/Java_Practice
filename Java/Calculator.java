import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        while(true){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first value :");
            int a = sc.nextInt();

            System.out.println("Enter second value :");
            int b = sc.nextInt();

            System.out.println("Enter the operation you want to perform =,-,*,/,%");
            char op = sc.next().charAt(0);

            switch(op){
                case '+': 
                System.out.println(a+"+"+b+"="+(a+b));
                break;
                case '-' : 
                System.out.println(a+"-"+b+"="+(a-b));
                break;
                case '*' : 
                System.out.println(a+"*" +b+"="+(a*b));
                break;
                case '/' :  
                if (b==0)
                    System.out.println("Error! Division by zero is not allowed.");
                else
                    System.out.println(a+"/"+b+"="+(a/b));
                break;
                case '%' :  
                if (b==0)
                    System.out.println("Error! Division by zero is not allowed.");
                else
                    System.out.println(a+"%" +b+"="+(a%b));
                break;
                default:  
                System.out.println("Invalid operator!");    
            }
        }
    }


    
}
