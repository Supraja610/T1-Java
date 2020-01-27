package com.cts.assignment;
import java.util.Scanner;

public class AssignmentQuiz {

	public static void main(String[] args) {
		int question1,question2,question3,count=0;
		boolean choice;
		Scanner sc=new Scanner(System.in);
		System.out.println("Do you want to play Quiz? type true or false");
		choice=sc.nextBoolean();
		if(choice)
		{
			System.out.println("Here it comes \n");
			System.out.println("Q1) What is the capital of India?");
			System.out.println("1) Delhi\r\n" + 
					"2) Mumbai\r\n" + 
					"3) Chennai\r\n" + 
					"");
			question1=sc.nextInt();
			if(question1==1)
			{
				System.out.println("Congrats your answer is correct");
				question1++;
				count++;
			}
			else
			{
				System.out.println("Your answer is incoorect. Delhi is the correct answer.");
			}
			System.out.println("Q2) Can you store the value \"dog\" in a variable of type int?");
			System.out.println("1) yes\r\n" + 
					"2) no\r\n" + 
					"");
			question2=sc.nextInt();
			if(question2==2)
			{
				System.out.println("Congrats your answer is correct");
				question2++;
				count++;
			}
			else
			{
				System.out.println("Your answer is incorrect. No is the correct answer.");
			}
			System.out.println("Q3) What is the result of 9+9/3?");
			System.out.println("1) 5\r\n" + 
					"2) 12\r\n" + 
					"3) 15/3\r\n" + 
					"");
			question3=sc.nextInt();
			
			if(question3==2)
			{
			System.out.println("Congrats your answer is correct\n");
			question3++;
			count++;
			}
			else
			{
				System.out.println("Your answer is incorrect. 12 is the correct answer.\n");
				
			}
			System.out.println("your score is " +count +"out of 3\n");
			System.out.println("Thanks for playing(^_^)");
		}
		else
		{
			System.out.println("Bye bye");
		}

	}

}
