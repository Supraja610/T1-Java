package com.cts.assignment2;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
	
				int n;
				int loc=0;
				Scanner sc  =new Scanner(System.in);
				
			     System.out.println(" enter the  number of elements requierd");
				
			     n = sc.nextInt();
				
			     int[] a = new int[n];
			     System.out.println("Enter the elements into array");
			     for(int i=0;i<n;i++) {
				
			    	 a[i] = sc.nextInt();
				}
				   System.out.println("elements enterd  is :");
				      for(int i=0;i<n;i++)
				{
					System.out.print(a[i]+"\t");
					
				}
				     System.out.println("\n");
				     System.out.println("which posistion value you want to delete?");
				     loc= sc.nextInt();
				     
				
				
		        if (a == null || loc== 0 || loc >= a.length) {  
		        	System.out.println("Invalid input");
		        } 
		  
		             int[] anotherArray = new int[a.length - 1]; 
		  
		       
		        for (int i = 0, k = 0; i < a.length; i++) { 
		  
		            
		            if (i == loc) { 
		                continue; 
		            } 
		            
		  
		            
		            anotherArray[k++] = a[i]; 
		        }
		        System.out.println("  elements enterd :");
				for(int i=0;i<n;i++)
				{
					System.out.print(a[i]+"\t");
				}
				 System.out.println(" \n");
				 System.out.println(" size-1 array :");
				System.out.println("\n");
		        for(int i=0;i<n-1;i++) {
					System.out.print(anotherArray[i]+"\t");
				}

		      

		

	}

}
