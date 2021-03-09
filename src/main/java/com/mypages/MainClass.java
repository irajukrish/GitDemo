package com.mypages;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		
//		String a="Dhanush";
//		String c="                 Raju Krish              ";
//		char b=a.charAt(4);
//		System.out.println(b);
//		
//		System.out.println(a.codePointAt(4));
//		System.out.println(a.codePointBefore(4));
//		System.out.println(a.codePointCount(3, 4));
//		System.out.println(a.concat(" Krish"));
//		System.out.println(a.equals("Dhanush"));
//		System.out.println(a.equalsIgnoreCase("DhaNush"));
//		System.out.println(a.compareTo("Dhanusa"));
//		System.out.println(a.compareToIgnoreCase("DhanusA"));
//		System.out.println(a.contains("Dhanusa"));
//		System.out.println(a.contentEquals("Dhanush"));
//		System.out.println(a.endsWith("h"));
//		System.out.println(a.hashCode());
//		System.out.println(a.substring(1));
//		System.out.println(a.substring(0, 3));
//		System.out.println(a.length());
//		System.out.println(a.replace("ush", "am"));
//		System.out.println(a.toUpperCase());
//		System.out.println(a.toLowerCase());
//		System.out.println(c.trim());
//		System.out.println(a.indexOf("h"));
//		System.out.println(a.lastIndexOf("h"));
		
		
		int a[]= {4,5,4,6,5,6,7,7,3,3,9};
		int y=0;
		ArrayList<Integer> x=new ArrayList<Integer>();
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]);
			if(!x.contains(a[i])) {
				y++;
			x.add(a[i]);
			}
			else 
			{
				System.out.println("Counts " + a[i] +" are " + y);
			}
		}
		
		for(int z: x) {
		System.out.println(z);
		}
		
		
		
		String b="Raju is a Superhero";
		System.out.println(b.length());
		for (int i=b.length()-1; i>=0; i--) {
			System.out.print(b.charAt(i));
		}
		
		
	}

}
