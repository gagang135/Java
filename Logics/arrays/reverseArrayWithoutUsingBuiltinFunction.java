// write a program to reverse a array without using builtin functions
import java.util.Scanner;
class reverseArrayWithoutUsingBuiltinFunction{
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a length of an array");
     int n=sc.nextInt();
     int arr[]=new int[n];
     System.out.println("enter an array elements");
     for (int i = 0; i < n; i++) {
         arr[i]=sc.nextInt();
     }

     int temp[]=new int[n];
     int j=0;
     for(int i=n-1;i>=0;i--){
        temp[j++]=arr[i];
     }
    System.out.println("array after reverse:\n");
     for(int i=0;i<n;i++){
        System.out.print(temp[i]+" ");
     }
 }
}