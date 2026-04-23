// write a program to move all the zeroes to front (by using sort)
import java.util.Arrays;
import java.util.Scanner;

class zerosToFront{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}