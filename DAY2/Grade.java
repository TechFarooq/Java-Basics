public class Grade {
    public static void main(String[] args) {
        int a=88 ;
        if (a<=100&&a>=90) {
          System.out.println(a+" A grade");            
        }
        else if(a<90&&a>=80){
          System.out.println(a+" B grade");
        }
        else if(a<80&&a>=70){
            System.out.println(a+" C grade ");
        }
        else if(a<70&&a>=60){
            System.out.println(a+" D grade ");
        }
        else{
            System.out.println("Fail");
        }

    }
}
