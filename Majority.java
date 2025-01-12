public class Majority {
    public static void main(String[] args) {
        int arr[]={2,2,1,1,1,2,2,3,3,3,3,3,3,3,3,3,3,};
        //output 2 bcoz majority is 2 
        //confirm that leader exist if not given that leader exist than search at last by binary search
        int n=arr.length;
        int el=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0){
                el=arr[i];
                count=1;
            }
            else if(arr[i]==el){
                count++;
            }
            else{
                count--;
            }
        }
        System.out.println("Leader element in the given array is :"+el);
    }
}
