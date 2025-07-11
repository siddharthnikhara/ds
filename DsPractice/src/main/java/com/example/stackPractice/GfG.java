package com.example.stackPractice;// Java program to count
// occurrence of days in a month
import java.util.*;
import java.lang.*;

public class GfG{

	// function to find occurrences
	public static void occurrenceDays(int n, String firstday)
	{
		// stores days in a week
		String[] days = new String[]{ "Monday",
				"Tuesday", "Wednesday",
				"Thursday", "Friday",
				"Saturday", "Sunday" };
		
		// Initialize all counts as 4.
		int[] count = new int[7];
		for (int i = 0; i < 7; i++)
			count[i] = 4;
		
		// find index of the first day
		int pos = 0;
		for (int i = 0; i < 7; i++)
		{
			if (firstday == days[i])
			{
				pos = i;
				break;
			}
		}
		
		// number of days whose occurrence
		// will be 5
		int inc = n - 28;
		
		// mark the occurrence to be 5 of n-28 days
		for (int i = pos; i < pos + inc; i++)
		{
			if (i > 6)
				count[i % 7] = 5;
			else
				count[i] = 5;
		}
		
		// print the days
		for (int i = 0; i < 7; i++)
		{
			System.out.println(days[i] + " " + count[i]);
		}
	}
	
	// Driver function
	public static void main(String argc[]){
		int n = 31;
		String firstday = "Tuesday";
		occurrenceDays(n, firstday);
	}
}

// This code is contributed by Sagar Shukla
