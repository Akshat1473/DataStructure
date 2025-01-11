import java.util.ArrayList;
import java.util.Scanner;

public class Setmatrix0 {
    public static void main(String[] args) {
        int r,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row: ");
        r=sc.nextInt();
        System.out.println("Enter the size of column: ");
        c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the Element of array: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Given array is as: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        //now perform operation to make the array 0
        ArrayList<Integer> li1=new ArrayList<>();
        ArrayList<Integer> li2=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==0){
                   li1.add(i);
                   li2.add(j);
                }
            }
        }
        //Row zero banayge
        for(int i=0;i<li1.size();i++){
            int index=li1.get(i);
            for(int j=0;j<c;j++){
                arr[index][j]=0;
            }
        }
        //Column zero code
        for(int i=0;i<r;i++){
            
            for(int j=0;j<li2.size();j++){
                int index=li2.get(j);
                arr[i][index]=0;
            }
        }
        //Matrix after zero set is as:
        System.out.println("Matrix after set of zero is as: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
