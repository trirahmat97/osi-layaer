package Presentation;

import java.util.Scanner;

public class Presentation {
	
	public static void main(String[] args) throws Exception {
		Bisnis da = new Bisnis();
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input name : ");
		String a = in.nextLine();
		String ah = da.add(a);
		
		System.out.println(ah);
	}
	
	
}
