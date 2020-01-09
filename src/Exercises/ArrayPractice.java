package Exercises;

import java.util.Arrays;

import static java.lang.System.*;

public class ArrayPractice {


        public static void main(String args[]){
            int num[]={1,2,5,6,3,2};
            String sentence = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse";
            String[] word = sentence.split(" ");
            out.println("input string words separated by whitespace: " + sentence);
            out.println("output string: " + Arrays.toString(word));
            out.println("Odd Numbers:");
            for(int i=0;i<num.length;i++){
                if(num[i]%2!=0){
                    out.println(num[i]);
                }
            }
        }
}
