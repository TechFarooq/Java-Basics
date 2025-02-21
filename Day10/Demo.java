public class Demo {

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello");
        StringBuffer sb1=new StringBuffer("hello");
        System.out.println(sb.toString().equals(sb1.toString()));
    }
}