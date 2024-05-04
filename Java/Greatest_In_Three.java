import java.util.Scanner;
public class Greatest_In_Three {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
     int a = sc.nextInt();
    
        System.out.println("\nEnter Second Number : ");
        int b = sc.nextInt();
    
        System.out.println("\nEnter Third Number : ");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.print("The greatest number is : " + a);
            }
            else{
                System.out.print("The greatest number is : " + c);
            }
        }
        else if(b>c){
            System.out.print("The greatest number is : " + b);
        }
        else{
            System.out.print("The greatest number is : " + c);
        }
    }
}
