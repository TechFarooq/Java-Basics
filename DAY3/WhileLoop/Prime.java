import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        while(n<100){
            if(n%2==0){
                System.out.println(n+" it is even");
            }
            else{
                System.out.println(n+" it is a prime");
            }
        }
    }
}
