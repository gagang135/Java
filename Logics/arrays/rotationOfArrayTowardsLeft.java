// write a program to rotate an array towards left (left rotation)
import java.util.Scanner;
class rotationOfArrayTowardsLeft{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array length");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter the number of rotations");
        int k=sc.nextInt();
        k=k%n;
        for (int i = 0; i < k; i++) {
            int first=arr[0];
            for (int j= 0; j < n-1; j++) {
                arr[j]=arr[j+1];
               
            }
            arr[n-1]=first;
            
            }
            System.out.println("array after "+k +" rotation");
        for (int i = 0; i < n; i++) {
                System.out.print(arr[i]+" ");
            
        }
    }
}