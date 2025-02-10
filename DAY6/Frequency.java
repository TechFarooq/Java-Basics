public class Frequency {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,2,5,4,4,5,6,7,7,5};
        int freq[]=new int[a.length];
        for(int i=0;i<a.length;i++){
             int num=a[i];//2,3,4,5
             int count=1;
             for(int j=i+1;j<a.length;j++)
             {
                if(num==a[j])
                {
                    count++;
                    freq[j]=-1;
                }
             }
             if(freq[i]!=-1)// To avoid repeated values
             {
                freq[i]=count;
             }
        }
        // System.out.println(Arrays.toString(freq));
        for(int i=0;i<a.length;i++){
            if(freq[i]!=-1){
                System.out.println(a[i]+" comes "+freq[i]+" times");
            }
        }
    }
}
