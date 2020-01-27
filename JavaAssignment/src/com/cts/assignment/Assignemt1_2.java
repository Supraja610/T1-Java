package com.cts.assignment;
import java.util.*;
import java.io.*;

public class Assignemt1_2 {

	public static void main(String[] args) {
		String name=null;
		String year=null;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			int nflag=0;
			int yflag=0;
			
			System.out.println("Enter your name:");
			name=sc.next();
			System.out.println("Enter your year of graduation:");
			year=sc.next();
			if(year.matches("[0-9]{4}"))
			{
				yflag=0;
			}
			else
			{
				System.out.println("Invalid year Please enter numbers only");
				yflag=1;
			}
			
		
		for(int i=0; i<name.length(); i++)
		{
			if(name.matches("^[a-zA-Z,@#$%&]+$"))
				{
				nflag=0;
				}
			else
			{
				nflag=1;
				System.out.println("Invalid name Please enter alphabets only");
				break;
			}
		}
		if(nflag==0 && yflag==0) {
			break;
			
		}
	}
		System.out.println("My name is :" +name+ " "+"and I will graduate in year"+year);
				
	}
}