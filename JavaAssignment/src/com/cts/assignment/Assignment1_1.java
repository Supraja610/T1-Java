package com.cts.assignment;
import java.util.*;
import java.io.*;

public class Assignment1_1 {

	public static void main(String[] args) {
		System.out.print("Enter your name:");
		Scanner sc=new Scanner(System.in);
          String name=sc.next();
          System.out.print("Enter your year of graduation:");
          int year=sc.nextInt();
          System.out.println("My name is "+ name+ " "+"and I will graduate in the year: "+ year);
	}

}
