public class GCDWithoutRecursion {
    public static void main(String[] args) {
        int a = 56, b = 98; // Example numbers
        int gcd;

        if (a < b) {
            gcd = a; // Start from the smaller number
        } else {
            gcd = b;
        }

        while (gcd > 0) {
            if (a % gcd == 0 && b % gcd == 0) {
                System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
                break;
            }
            gcd--; // Decrement until we find the GCD
        }
    }
}