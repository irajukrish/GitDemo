package com.mypages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ProgramCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<String> AL=new ArrayList<String>();
//		AL.add("Prasad");
//		AL.add("Gaurav");
//		AL.add("Himani");
//		AL.add("Sonam");
//		
//		for (String element : AL) {
//			System.out.println(element);
//		}
//		
//		HashSet<String> HS=new HashSet<String>();
//		HS.add("Prasad");
//		HS.add("Gaurav");
//		HS.add("Himani");
//		HS.add("Sonam");
//		
//		for (String element : HS) {
//			System.out.println(element);
//		}
//		
//		Iterator<String> I=HS.iterator();
//		while (I.hasNext()) {
//			System.out.println(I.next());
//		}
		
		System.out.println("----------------------------------------------------------------");
		
		HashMap<Integer,String> HM=new HashMap<Integer, String>();
		HM.put(1, "Tejas");
		HM.put(2, "Supriya");
		HM.put(3, "Mithilesh");
		HM.put(4, "Raghab");
		System.out.println(HM.get(2));
		
		Set hm=HM.entrySet();
		Iterator IHM=hm.iterator();
		while(IHM.hasNext()) {
			Map.Entry ME=(Map.Entry)IHM.next();
			System.out.println(ME.getKey() + " Key and Value Pair "+ ME.getValue());
			System.out.println(ME.getKey());
		}
		

	}

}
