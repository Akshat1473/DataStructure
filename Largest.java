public class Largest {
    public static int maximum(int a[]){
        int m=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
             if(a[i]>m){
                m=a[i];
             }
        }
        return m;
    }
    public static void main(String[] args) {
        int arr[]={4,2,120,12,43,53,53};
        int max=maximum(arr);
        System.out.println("Maximum of element of array is: "+max);
    }
}
