public class Array2 {
    public static void main(String[] args) {
        int a[]={4,8,3,6,1};
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        int third=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(first>a[i]){       //intially first=9,second=9,third=9
               third=second;
               second=first;
               first=a[i];
            }
            else if(second>a[i]){ //third.a[i]&&a[i]!=first&&a[i]!=second  third=a[i] 
                third=second; 
                second=a[i];
            }      
        }
        System.out.println(third);
    }
}
