
import java.util.Scanner;

public class Count{
    public static String countandsay(int m){
        if(m==1)return "1";
        String s=countandsay(m-1);
        StringBuilder res=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            count++;
            //segregate
            if(i==s.length()-1||s.charAt(i)!=s.charAt(i+1)){
                res.append(count).append(s.charAt(i));
                count=0;
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number for count ans say :");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        String ans=countandsay(n);
        System.out.println(ans); 
        sc.close();
    }
}

