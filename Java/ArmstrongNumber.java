import java.util.Scanner;
public class ArmstrongNumber {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value to check if it is an Armstrong number or not :");
        int n = sc.nextInt();

        int temp = n;
        int ans=0;

        while (n>0){
            int rem = n % 10;
            ans=ans+(rem*rem*rem);
            n /= 10;
        }

        if (temp==ans){
            System.out.println(temp + " is an Armstrong Number.");
        }else{
            System.out.println(temp + " is not an Armstrong Number.");
        }


    }
    
}
