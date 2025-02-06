
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // integer
        System.out.println("Enter the integer:");
        int a = sc.nextInt();
        System.out.println(a);

        // float
        System.out.println("Enter the Float");
        float f = sc.nextFloat();
        System.out.println(f);

        // String
        String s = sc.nextLine();
        System.out.println(s);
    }
}
