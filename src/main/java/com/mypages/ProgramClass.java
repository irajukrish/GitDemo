package com.mypages;

public class ProgramClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int A[]= {2,5,8,7,4};
//		int t=0;
//		for(int i=0;i<A.length;i++) {
//			t=t+A[i];
//			System.out.println(A[i]);
//		}
//		System.out.println("Sum of all " + t);
//	}
	
	
	int A[][]= {{1,2,3},{4,5,0},{7,8,9}};
	int t=A[0][0] ;
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			
			System.out.print(A[i][j] + " ");	
			if(A[i][j] < t) {
				t=A[i][j];
			}
						}
		System.out.println("");	
	}
	
		System.out.println("Lowest Value in a matrix " + t);
		
		
		
	}
	
}
