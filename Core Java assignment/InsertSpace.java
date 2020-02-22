package com.cg.lab14;

import java.util.Scanner;
import java.util.function.Function;

public class InsertSpace {

	private static void formatString(String str) {
		Function<String,String> f= (s)->
		{StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
		   if (i > 0) {
		      result.append(" ");
		    }

		   result.append(str.charAt(i));
		}

		return result.toString();
		};
		String res=f.apply(str);
		System.out.println(res);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		formatString(str);
		sc.close();
	}
}


