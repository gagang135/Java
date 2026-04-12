//write a program to merge three unsorted array into single sorted array


import java.util.Arrays;
import java.util.Scanner;
class mergingOfTwoArrays{
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

        int arr4[]=new int[n1+n2+n3];
        System.arraycopy(arr1, 0, arr4, 0, n1);
        System.arraycopy(arr2, 0, arr4, n1, n2);
        System.arraycopy(arr3, 0, arr4, n1+n2, n3);
        Arrays.sort(arr4);
        System.out.println("fina sorted array elements are;");
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i]+" ");
            
        }
    }
}