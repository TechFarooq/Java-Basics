public class Pattern4 {

    public static void main(String[] args) {
        int n=7;
        for(int i=1;i<n*2;i++){
            int totalcols=i>n?2*n-i:i;
          for (int j=1;j<=totalcols;j++){
              System.out.print("^-..-^");
          }
          System.out.println();
        }
    }
}