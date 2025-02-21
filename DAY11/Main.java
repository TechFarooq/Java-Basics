import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        int a[] = {2, 3, 4, 5, 6, 7, 8, 11};
        Predicate<Integer> p = (n) -> (n % 2 == 0);  
        Predicate<Integer> p1 = (n) -> (n < 10);   

     
        System.out.println("Even numbers less than 10:");
        for (int num : a) {
            if (p.test(num) && p1.test(num)) {  
                System.out.println(num);
            }
        }
    }
}
