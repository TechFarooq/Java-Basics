import java.util.Scanner;
public class Factor {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println(count);
     }    
}
