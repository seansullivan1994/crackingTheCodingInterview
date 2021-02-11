package com.CrackingTheCodingInterview.ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPalidronePermutation("racecar"));
        System.out.println(isPalidronePermutation("sracecar"));
    }
    public static boolean isPalidronePermutation(String a) {
        boolean isPalidronePermutation = false;
        Map<Character, Integer> characterCount = new HashMap<>();
        for (Character c : a.toCharArray())
        {
            if(characterCount.containsKey(c))
            {
                characterCount.put(c, characterCount.get(c)+1);
            }else{
                characterCount.put(c,1);
            }
        }

        for(Map.Entry<Character, Integer> keyValue: characterCount.entrySet()){
            if(keyValue.getValue() % 2!= 0 && !isPalidronePermutation) {
                isPalidronePermutation = true;
            }else if (keyValue.getValue() %2 !=0 && isPalidronePermutation)
            {
                return false;
            }
        }
        return isPalidronePermutation;
    }
}
