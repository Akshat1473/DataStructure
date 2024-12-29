import java.util.Scanner;

public class Integer_Rom {
    public static String conversion(int n){
        int arr[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String str[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(n>0){
               while(n>=arr[i]){
                   sb.append(str[i]);
                   n=n-arr[i];
                   
               }
               i++;
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        //now conversion perform
        String str=conversion(num);
        System.out.println("Roman value of "+num+" is: "+str);
        sc.close();
    }
}
