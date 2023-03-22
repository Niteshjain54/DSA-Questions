import java.io.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner scn= new Scanner(System.in);
 		System.out.println("For nPr");
 		System.out.println("Enter Value of n : ");
		int n=scn.nextInt();
		System.out.println("Enter Value of r : ");
		int r=scn.nextInt();
		int nfact=1;
		int nrfact=1;
		for(int i=1;i<=n;i++){
		    nfact =nfact*i;
		}
		for(int i=1;i<=n-r;i++){
		    nrfact =nrfact*i;
		}
		int ans=nfact/nrfact;
		System.out.println("nPr  : " + ans);
	
	}

}


