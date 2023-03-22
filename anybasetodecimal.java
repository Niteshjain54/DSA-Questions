import java.util.*;

public class Main {
    
    public static void main (String[] args){
        Scanner scn= new Scanner (System.in);
        System.out.println("Enter the Number : ");
        int n= scn.nextInt();
        System.out.println("Enter the base : ");
        int b=scn.nextInt();
        int ans=AnyBaseToDecimal(n,b);
        System.out.println(ans);
    }
    
    public static int AnyBaseToDecimal(int n,int b){
        int sum=0;
        int p=1;
        while(n>0){
            int rem=n%10;
            sum= sum+rem*p;
            p=p*b;
            n=n/10;
        }
        return sum;
    }
    
}