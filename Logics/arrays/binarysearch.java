// write a program to find an element in the given sorted array (binary search)
import java.util.Arrays;
import java.util.Scanner;
class binarySearch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element need to find:");
        int key=sc.nextInt();
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println("\nindex of key value is "+Arrays.binarySearch(arr, key));
    }
}