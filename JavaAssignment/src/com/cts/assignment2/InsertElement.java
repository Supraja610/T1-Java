package com.cts.assignment2;
import java.util.Arrays;
import java.util.Scanner;


public class InsertElement {

	public static void main(String[] args) {
		
		
		
				int n;
				int temp=0;
				int loc=0;
				System.out.println(" enter the  number of elements requierd");
				Scanner sc  =new Scanner(System.in);
				n = sc.nextInt();
			
				int[] a = new int[n];
				System.out.println("Enter the elements into Array");
				
				for(int i=0;i<n;i++)
				{
					a[i] = sc.nextInt();
			}
				System.out.println("elements enterd  is :");
			      for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+"\t");
				
			}
			      System.out.println("\n");
			      
				System.out.println("At which position value you want to insert!?");
				loc = sc.nextInt();
				System.out.println("Enter the element  to insert");
				
			    if ( loc < 0 || loc >= a.length) 
			    {  
		        	System.out.println("Invalid input");
		    }
		        if(a == null)
		        {
		        	a[0] = sc.nextInt();
		    }
		  
		        int[] anotherArray = new int[a.length + 1]; 
		  
		        for (int i = 0, k = 0; i < a.length; i++) { 
		  
		    
		            if (i == loc) { 
		                temp = a[i];
		                anotherArray[k++] = sc.nextInt();
		                anotherArray[k++] = temp;
		     
		            } 
		            else {
		            	anotherArray[k++] = a[i];
		            }
		    
		        } 
		        System.out.print( "array after inserstion :");
		        for(int i=0;i<n+1;i++) {
					
					System.out.print(anotherArray[i] +"\t");
				
			}
	}
	}