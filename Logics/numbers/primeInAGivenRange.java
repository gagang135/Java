//wirte a program to print all the prime numbers within the given range
import java.util.Scanner;
class primeInAGivenRange{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=1;
        System.err.println("enter the range");
        
        int range=sc.nextInt();
        for(int i=n;i<=range;i++){
            boolean f=true;
            if(i<=1){
            f=false;
            }else{
                for(int j=2;j<=Math.sqrt(i);j++){
                    if(i%j==0){
                        f=false;
                        break;
                    }
                }
        }
        if(f){
            System.out.println("next prime number is: "+i);
        }
    }
}
}