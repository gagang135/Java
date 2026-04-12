//write a program to merge two unsorted arrays into a single sorted ayya without using builtin functions(arraycopy)

import java.util.Arrays;
import java.util.Scanner;
class mergeofThreeArraysWithoutUsingBuiltinFunctions{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of first array:");
        int n1=sc.nextInt();
        System.out.println("Enter the elements of first array:");
        int arr1[]=new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i]=sc.nextInt();
        }


        System.out.println("enter the size of second array:");
        int n2=sc.nextInt();
        System.out.println("Enter the elements of second array:");
        int arr2[]=new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i]=sc.nextInt();
        }

        System.out.println("enter the size of third array:");
        int n3=sc.nextInt();
        System.out.println("Enter the elements of third array:");
        int arr3[]=new int[n3];
        for (int i = 0; i < n3; i++) {
            arr3[i]=sc.nextInt();
        }

        int j=0;

        int arr4[]=new int[n1+n2+n3];
        for (int i = 0; i < n1; i++) {
            arr4[j++]=arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            arr4[j++]=arr2[i];
        }
        for (int i = 0; i < n3; i++) {
            arr4[j++]=arr3[i];
        }
        Arrays.sort(arr4);
        for(int i=0;i<arr4.length;i++)
        {
            System.out.print(arr4[i]+" ");
        }
    }
}