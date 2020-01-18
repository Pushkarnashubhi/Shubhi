package com;
import java.util.*;
public class Anagrams 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String x;
		String y;
		x=s.next();
		y=s.next();
		check_Anagram(x,y);
	}
public static void check_Anagram(String x ,String y)
{
	int flag=0;
	int n=x.length();

	char arr1[]= x.toCharArray();
	char arr2[]= y.toCharArray();	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	for(int i=0;i<n;i++)
	{
		if(arr1[i]==arr2[i])
		{
			flag=1;
		}
		else
		{
			flag=0;
			break;
		}
	}
	
	if(flag==1)
	{
		System.out.println(" They are Anagrams");
	}
	else
	{
		System.out.println(" They are not Anagrams");
	}
	
	}
}