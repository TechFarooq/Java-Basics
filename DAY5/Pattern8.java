public class Pattern8 {
    public static void main(String[] args) {
        int n=777;
        for(int i=1;i<n*2;i++){
          int totalColinRow=i>n?2*n-i:i;
          int spaces=n-
          
          totalColinRow;
          for(int j=1;j<=spaces;j++){
            System.out.print(" ");
          }  
          for(int k=totalColinRow;k>0;k--){
            System.out.print(k);
          }  
          System.out.println();        
        }
    }    
}
