package start.java;

import java.util.Scanner;

public class Triplets {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println(" Enter the values");
	
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	int base=a*a;
	int height=b*b;
	int hypo=c*c;

	   if(base+ height==hypo) {
		   System.out.println("yes");
	   }
	   else {
		   System.out.println("No");
	   }

	}

}
