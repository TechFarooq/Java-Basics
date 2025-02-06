import java.util.Scanner;
public class ReverseDigit {
    public static void main(String[] args) {
        int rem=0;
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        while(n!=0){
            rem=n%10;
            sum=sum*10+rem;
             n=n/10;
            }
            System.out.println(sum);
    }
}
