package com.cg.tp.Lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exercise1.getValues();
		List<String> tempList=new ArrayList<>();
		tempList=Exercise1.getValues();
		for(String data:tempList) {
			System.out.println(data);
		}

	}
	
	public static ArrayList<String> getValues() {
		
		HashMap<Integer, String> hashMap=new HashMap<>();
		
		hashMap.put(1, "Amartya");
		hashMap.put(2, "Anushka");
		hashMap.put(3, "Mono");
		hashMap.put(4, "Debadrita");
		hashMap.put(5, "Ritika");
		hashMap.put(6, "Sankhya");
		
		ArrayList<String> arrayList=new ArrayList<>();
		
		
		
		for(int i=1;i<=hashMap.size();i++) {
			arrayList.add(hashMap.get(i));
		}
		Collections.sort(arrayList);
		return arrayList;
	}

}
