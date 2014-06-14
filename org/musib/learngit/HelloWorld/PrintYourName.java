package org.musib.learngit.HelloWorld;

import java.util.Scanner;

public class PrintYourName {

	public static void main(String[] args) 
	{
		String userName = readAndPrintUserName();
		if(userName != null)
		{
			System.out.println(" Hi! "+userName +", welcome to the world of Git.");
		}
		else
		{
			System.out.println(" Sorry!! you have not entered your name. ");
		}
	}
	
	private static String readAndPrintUserName()
	{
		String userName = null;
		System.out.println(" Hi! What is your name? ");
		Scanner scanner = new Scanner(System.in);
		userName = scanner.next();
		if(scanner != null)
		{
			scanner.close();
		}
		return userName;
	}

}
