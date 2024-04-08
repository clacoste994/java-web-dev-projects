package org.launchcode;

import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;

public class CountingCharacters {



    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
            String myString = "If the product of two terms " +
                    "is zero then common sense says at least " +
                    "one of the two terms has to be zero to " +
                    "start with. So if you move all the terms over to " +
                    "one side, you can put the quadratics " +
                    "into a form that can be factored allowing " +
                    "that side of the equation to equal zero. " +
                    "Once you’ve done that, it’s pretty straightforward from there.";
//        System.out.println("Please enter a sentence");
//        String myString = input.nextLine();
            HashMap<Character, Integer> charDict = new HashMap<>();
            char[] charactersInString = myString.toCharArray();
            for (char c: charactersInString){
                if (!charDict.containsKey(c)){
                    charDict.put(c, 1);
                } else {
                    int sum = charDict.get(c) + 1;
                    charDict.put(c, sum);
                }
            }
            for (Map.Entry<Character, Integer> entry : charDict.entrySet()){
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
