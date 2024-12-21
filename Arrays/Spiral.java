import java.util.Scanner;

class Spiral{
    public static void spiralmatrix(int a[][],int row,int column){
            int m=a.length;
            int n=a[0].length;
            int dir=0;
            while(){
                if(dir==0){
                    for()
                }
            }
            

    }
    public static void main(String[] args) {
        System.out.println("Enter the size of row:");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println("Enter the size of column :");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter the Element of Array");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("The printed array is as: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        spiralmatrix(arr,r,c);
    }
}