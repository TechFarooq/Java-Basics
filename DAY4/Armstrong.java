import java.util.Scanner;
public class Armstrong {
     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int count=0;
       
        for(int i=n;i>0;i=i/10){
            count++;
        }
        int rem=0,result=0;
        int temp=n;

        while(temp!=0){
            rem=temp%10;
            result=result+(rem*rem*rem);
            temp=temp/10;
        }
        if(n==result){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not an Armstrong");
        }
     }    
}
