import java.util.*;

public class Main {
    
    public static void main (String[] args){
        Scanner scn= new Scanner (System.in);
        System.out.println("Enter the Number : ");
        int n= scn.nextInt();
        System.out.println("Enter the Number to find : ");
        int d=scn.nextInt();
        int ans=DigitF(n,d);
        System.out.println("The digit Frequency of " + d + " is : " + ans );

    }
    
    public static int DigitF(int n,int d){
        int count=0;
        while(n>0){
            if(n%10==d){
                count=count+1;
                
            }
            n=n/10;
        }
        return count;
    }
}