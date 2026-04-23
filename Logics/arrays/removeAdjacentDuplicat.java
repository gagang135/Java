// write a program to remove adjacent duplicate values in an array
import java.util.Scanner;
class removeAdjacentDuplicat{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the length of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("final array after removing adjacent duplicate values:");

        for (int i = 0; i < n-1; i++) {
            if(arr[i]!=arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
        
        
        System.out.println(arr[n-1]);
    }
}