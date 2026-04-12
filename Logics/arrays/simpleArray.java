// write a programs to print the array 
/*1. forward direction
2.bachward direction
3. even numbers
4. odd numbers
5. odd position elements
6. even position elements
7.sum of all elements 
8. sum of odd numbers
9.sum of even numbers
10.porduct of all numbers 
11. product of even numbers
12. product of odd numbers
13. count of all numbers
14. count of even numbers
15. count of odd number
 */
import java.util.Scanner;

class simpleArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total length of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //forward direction
        System.out.println("array elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
System.out.println("\n--------------------------------------");
        //backward direction
        System.out.println("backward direction:");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
System.out.println("\n--------------------------------------");
System.out.println("even numbers:");
        //even numbers
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("\n--------------------------------------");
System.out.println("even numbers backward direction:");
        //even backward
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]%2==0){
            System.out.print(arr[i]+" ");
        }
        }
System.out.println("\n--------------------------------------");
System.out.println("odd numbers");
        //odd numbers
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("\n--------------------------------------");
System.out.println("odd numbers backward direction:");
        //odd backward
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]%2!=0){
            System.out.print(arr[i]+" ");
        }
        }
System.out.println("\n--------------------------------------");
System.out.println("even position elements:");

        //even position elements
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("\n--------------------------------------");
System.out.println("even position elements backward");
        //even position backward
        for(int i=arr.length-1;i>=0;i--){
            if(i%2==0){
            System.out.print(arr[i]+" ");
        }
        }
System.out.println("\n--------------------------------------");
System.out.println("odd position elements:");
        //odd position numbers
        for(int i=0;i<n;i++){
            if(i%2!=0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("\n--------------------------------------");
System.out.println("odd position elements backward:");
        //odd position backward
        for(int i=arr.length-1;i>=0;i--){
            if(i%2!=0){
            System.out.print(arr[i]+" ");
        }
        }
        System.out.println("\n--------------------------------------");

System.out.println("Sum of all the elements");
        //sum of all the elements
        int sum1=0;
        for(int i=0;i<arr.length;i++){
            sum1+=arr[i];
        }
        System.out.print(sum1);
System.out.println("\n--------------------------------------");
System.out.println("Sum of even elements");
        //sum of even numbers
        int sum2=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
               sum2+=arr[i]; 
            }
        }
        System.out.println(sum2);
System.out.println("\n--------------------------------------");

        System.out.println("sum of odd elemenets");
        //sum of odd numbers
        int sum3=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                sum3+=arr[i];
            }
        }
        System.out.println(sum3);

System.out.println("\n--------------------------------------");
System.out.println("product of all elements");
        //product of all the elements
        int pro=1;
        for(int i=0;i<n;i++){
            pro*=arr[i];
        }
        System.out.println(pro);

System.out.println("\n--------------------------------------");
System.out.println("product of even numbers");
        //product of even numbers
        int pro2=1;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
               pro2+=arr[i]; 
            }
        }
        System.out.println(pro2);

System.out.println("\n--------------------------------------");

        System.out.println("Product of odd numbers");
        //product of odd numbers
        int pro3=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                pro3+=arr[i];
            }
        }
        System.out.println(pro3);

System.out.println("\n--------------------------------------");
System.out.println("count of all the elements:");

        //count of all the elements
        int count=0;
        for(int i=0;i<arr.length;i++){
            count++;
        }
        System.out.print(count);

System.out.println("\n--------------------------------------");
System.out.println("count of even numbers:");
        //sum of even numbers
        int count2=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
               count2++;
            }
        }
        System.out.println(count2);

System.out.println("\n--------------------------------------");
System.out.println("count of odd numbers");
        
        //sum of odd numbers
        int count3=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                count3++;
            }
        }
        System.out.println(count3);
    }
}