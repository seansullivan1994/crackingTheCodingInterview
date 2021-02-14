package com.CrackingTheCodingInterview.ArraysAndStrings;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        System.out.println(find(exampleTest1));
        System.out.println(find(exampleTest2));
        System.out.println(find(exampleTest3));
    }

    static int find(int[] integers){

        ArrayList<Integer> even =new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for(int integer: integers){
            if(integer %2 == 0)
            {
                even.add(integer);
            }else
            {
                odd.add(integer);
            }
        }
        if(even.size() == 1){
            return even.get(0);
        }else
        {
            return odd.get(0);
        }


    }
}
