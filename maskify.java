package com.CrackingTheCodingInterview.ArraysAndStrings;

public class Main {

    public static void main(String[] args) {

    }

    public static String maskify(String str) {
        StringBuilder builder = new StringBuilder();
        if(str.length() <= 4)
            return str;
        else{
            String temp = str.substring(str.length()-4, str.length());
            int numberOfHashes = str.length() - 4;
            for(int i = 0; i < numberOfHashes; i++){
                builder.append("#");
            }
            builder.append(temp);
        }
        return builder.toString();
    }
}
