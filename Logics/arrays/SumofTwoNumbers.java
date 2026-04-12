// write a prgram to find the sum of two elements which is equal to the target element.

import java.util.Scanner;
class SumofTwoNumbers{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter teh array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target element:");
        int target=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("elements are:"+arr[i]+" and "+arr[j]);
                }
            }
        }
    }
}