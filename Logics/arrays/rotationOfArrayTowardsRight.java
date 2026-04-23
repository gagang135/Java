// write a program to rotate the given array towards right(right rotation)
import  java.util.Scanner;
class rotationOfArrayTowardsRight{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the number of rotation:");

        int k=sc.nextInt();
        k=k%n;
        for (int i = 0; i < k; i++) {
            int last=arr[n-1];
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }

    
    System.out.println("array after right rotation");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
}