public interface Contract {
    public static void main(String[] args) {
        System.out.println("hi");
    }
    default void calculate_salary(int a,int b)
    {
        System.out.println(a+b);
    }
    static void test()
    {
        System.out.println("Contract employee");
    }
}