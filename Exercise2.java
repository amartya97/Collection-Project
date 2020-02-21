package com.cg.tp.Lab7;

import java.util.HashMap;
import java.util.Map.Entry;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Amartya"; 
        characterCount(str); 

	}
	
	public static void characterCount(String inputString) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>(); 
  
        char[] strArray = inputString.toCharArray(); 
  
        for (char c : strArray) { 
            if (charCountMap.containsKey(c)) { 
                charCountMap.put(c, charCountMap.get(c) + 1); 
            } 
            else { 
                charCountMap.put(c, 1); 
            } 
        } 
        for (Entry<Character, Integer> entry : charCountMap.entrySet()) { 
            System.out.println(entry.getKey() + " " + entry.getValue()); 
        } 
    }

}
