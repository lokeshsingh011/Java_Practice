import java.util.Scanner;
public class EvenOdd {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int e = sc.nextInt();

        int ce = 0;
        int co = 0;

        for (int s = 1;s<=e;s++){
            if(s%2==0){
                ce++;
            }else{
                co++;
            }
        }

        System.out.println("There are "+ce+" even numbers between 1 and "+e);

        for(int s=1; s<=e; s++){
            if(s%2==0){
                System.out.print(s+"\n");
            }
        }



        System.out.println("There are "+co+" odd numbers between 1 and "+e);

        for(int s=1; s<=e; s++){
            if(s%2!=0){
                System.out.print(s+"\n");
            }
        }
    }
    
}
