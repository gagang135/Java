//write a program to sort the given array elements without using builtin function (bubble sort)
 import java.util.Arrays;
 import java.util.Scanner;
class bubbleSort{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){ //iteration count
            for(int j=0;j<n-1-i;j++){ //traversal
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }System.out.println("sorted array:");
        System.out.println(Arrays.toString(arr));
    }
}