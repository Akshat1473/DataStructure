public class Kadans {
    public static void main(String[] args) {
        //find maximum subarray sum
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
       System.out.println("Maximum subarray sum is: "+max); 
    }
}
