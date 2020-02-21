package com.cg.tp.Lab7;

import java.util.HashMap;
import java.util.Map;

public class Exercise3 {

	public static void main(String[] args) {
		
		int[] tempArray= {1,2,3,4,5};
		HashMap<Integer,Integer> tempMap=new HashMap<>();
		
		tempMap=Exercise3.getSquares(tempArray);
		
		for(Integer key:tempMap.keySet()) {
			System.out.printf("%d -> %d\n",key,tempMap.get(key));
		}

	}
	
	public static HashMap<Integer, Integer> getSquares(int[] numbers) {
		
		Map<Integer,Integer> hashMap=new HashMap<>();
		
		int[] squareArray=new int[numbers.length];
		
		for(int i=0;i<numbers.length;i++) {
			squareArray[i]=numbers[i]*numbers[i];
		}
		
		for(int i=0;i<numbers.length;i++) {
			hashMap.put(numbers[i], squareArray[i]);
		}
		return (HashMap<Integer, Integer>) hashMap;
	}

}
