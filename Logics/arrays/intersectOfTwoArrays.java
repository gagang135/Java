// write a program to find the intersection of two given Arrays

import java.util.Scanner;

class intersectOfTwoArrays{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the length of first array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the first array elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

         System.out.println("enter the length of second array");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        System.out.println("enter the second array elements");
        for (int i = 0; i < n2; i++) {
            arr2[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                if(arr[i]==arr2[j]){
                    System.out.print(arr[i]+" ");
                }
            }
            
        }
    }

}