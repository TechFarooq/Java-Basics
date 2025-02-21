class Childdemo {
    public void divide(int a, int b) {
        System.out.println(a / b); 
    }
}

public class Exceptional extends Childdemo {
    public static void main(String[] args) {
        Exceptional e = new Exceptional();
        try {
            e.divide(2, 0);
        } catch (ArithmeticException ex) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
