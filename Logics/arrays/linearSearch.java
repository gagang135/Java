//write a program to search the element in unsorted array (linear search)

import java.util.Scanner;
class linearSearch{
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

        for (int i = 0; i < n; i++) {
            if(arr[i]==key){
                System.out.println("the element is found at index "+i);
                return;
            }
        }
        System.out.println("no search element is found in an array.");
    }
}