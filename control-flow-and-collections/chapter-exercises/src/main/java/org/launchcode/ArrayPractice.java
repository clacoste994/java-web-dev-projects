package org.launchcode;

import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[] args) {
        int[] simpleArray = {1,1,2,3,5,8};
        //for-each loop
        for (int i : simpleArray) {
            System.out.println(i);
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] sentences = phrase.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
