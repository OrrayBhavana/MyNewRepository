package VJIT;
import java.util.Scanner;
public class CheckingString {

	
	public void operations(int choice)
	{
		String s1=new String("PREETHI");
		 StringBuilder sb = new StringBuilder(s1);
		String s =new String();
		
		switch(choice)
		{
		case 1:
		{
			s1=s1+s1;
		 System.out.println("added string is " + s1);
		 break;
		}
		case 2:
		{
			StringBuilder sb1 = new StringBuilder(s1);
			
			for (int i = 0; i < sb1.length(); i++) {
			    
			        if (i % 2 !=0) {
			            sb1.setCharAt(i, '#');
			        }
			}
			System.out.println(sb1);
			break;
	     }
		case 3:
		{
			for (int i = 0; i <s1.length(); i++) {
		        if(!s.contains(String.valueOf(s1.charAt(i)))) {
		            s += String.valueOf(s1.charAt(i));
		        }
			}
	    	 System.out.println(s);
	    	 break;
		}
		case 4:
		{
			for (int i = 0; i < s1.length(); i++) {
				char ch = s1.charAt(i);
		        if (i % 2 !=0) {
		        	System.out.println(Character.toLowerCase(ch));
		        }
		        else {
		            System.out.print(Character.toUpperCase(ch));
		        	}
		        
			}
		}
		}
	}
		
	public static void main(String args[])
	{
		
		CheckingString cr = new CheckingString();
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		cr.operations(choice);
		
		
		
		
	}
	
	
	
	
	
}