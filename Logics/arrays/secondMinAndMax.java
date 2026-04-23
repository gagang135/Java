// write a program to print the second min and max elements of an array

class secondMinAndMax{
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0], max=arr[0];
        int smin=Integer.MAX_VALUE;
        int smax=Integer.MIN_VALUE;

}
}