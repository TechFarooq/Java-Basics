@FunctionalInterface
interface Calculator {
    void add(int a, int b);
}

public class User {
    public static void main(String[] args) {
        Calculator c = (a, b) -> System.out.println(a + b);
        c.add(2, 3);
    }
}
