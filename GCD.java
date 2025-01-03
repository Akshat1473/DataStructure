import java.util.Scanner;

public class GCD {

    public static int gcd(int num1,int num2){
        while(num2!=0){
            int temp=num2;
            num2=num2%num1;
            num1=temp;
        }
        return num1;
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