
import java.util.Scanner;

//write aprogram to generate next prime number
class nextPrimeNum{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n=sc.nextInt();
    
    for (int i = n+1; i <= 100; i++) {
       boolean f=true;
    if(i<=1){
        f= false;
        
    }
    else{
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if(i % j == 0){
                f=false;
                // break;
            }
        }
    }
    
    if(f){
        System.out.println("next prime number is "+ i);
        // break;
    }
    
    }
}
}