import java.util.*;

public class Main {
    
    public static void main (String[] args){
        Scanner scn= new Scanner (System.in);
        System.out.println("Enter the Number : ");
        int n= scn.nextInt();
        System.out.println("Enter the base : ");
        int b=scn.nextInt();
        int ans=D2B(n,b);
        System.out.println("Answer is :" + ans);
    }
    
    public static int D2B(int n,int b){
        int sum=0;
        int p=1;
        while(n>0){
            int ans=n%b;
            sum += ans*p;
            n=n/b;
            p=p*10;
        }
        return sum;
    }
    
}