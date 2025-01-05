import java.util.Scanner;

public class GCD {

    public static int gcd(int num1,int num2){
       while(num1>0||num2>0){
           if(num1>num2){
                num1=num1%num2;
           }
           else{
               num2=num2%num1;
           }
    }
        if(num1==0)return num2;
        if(num2==0)return num1;
        return 1;
    }
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two number: ");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("GCD of the number is as: "+gcd(a,b));
    }
}
