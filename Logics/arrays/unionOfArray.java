// wriet a program to find the union of two Arrays

import java.util.Arrays;
import java.util.Scanner;
class unionOfArray{
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

        int temp[]=new int[n+n2];

        System.arraycopy(arr, 0, temp, 0, n);
        System.arraycopy(arr2, 0, temp, n, n2);

        Arrays.sort(temp);
        for (int i = 0; i < temp.length-1; i++) {
            if(temp[i]!=temp[i+1]){
                System.out.print(temp[i]+" ");
            }
        }
        System.out.println(temp[temp.length-1]);


    }
}