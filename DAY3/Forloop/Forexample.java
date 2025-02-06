import java.util.Scanner;
public class Forexample {
    public static void main(String[] args) {
        System.out.print("Enter table:");
        Scanner sc=new Scanner(System.in);
        int table=sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(i +"*"+ table +"="+i*table);
        }
    }
}
