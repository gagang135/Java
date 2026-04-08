//write a program to print second small prime number in given array
import java.util.Arrays;
import java.util.Scanner;
class secondSmallPrime{

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
                
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    
    System.err.println("Enter the length of an array:");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int count=0;
        int arr[]=new int[no];
        System.err.println("Enter the array elements");
        for (int i = 0; i < no; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
             if( isPrime(arr[i])){
                count++;
                
            
            if(count==2){
            System.err.println(arr[i]+" is a 2nd smallest prime number");
        }
        }
             }
        }
        
        


}