// write a program to reverse an array without using an extra array

import java.util.Scanner;
class reverseArrayWithoutUsingextraArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array before reversing");
        for(int e=0;e<n;e++){
            System.out.println(arr[e]);
        }
        int i=0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println("array after reversing");

        for(int e=0;e<n;e++){
            System.out.println(arr[e]);
        }
    }
}