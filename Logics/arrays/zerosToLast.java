// write a program to move all zeros to last with temporary array

import java.util.Arrays;
import java.util.Scanner;
class zerosToLast{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the length of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int temp[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[j++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(temp));
    }
}