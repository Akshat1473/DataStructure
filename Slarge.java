public class Slarge {
    public static int sl(int a[],int n){
        int s=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                s=max;
                max=a[i];
            }
            else if(a[i]<max&&a[i]>s){
                s=a[i];
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int arr[]={34,3,23,46,43,4};
        int n=arr.length;
        int ans=sl(arr,n);
        System.out.println("Second largest number is: "+ans);
    }
}
