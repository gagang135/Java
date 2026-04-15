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
     int i=0,j=n-1;
     while(i<j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
        i++;
        j--;
     }
     for(int k=0;k<n;k++){
        System.out.print(arr[k]+" ");
     }
 }
}