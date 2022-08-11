package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class ArrayListPractice {
    public static void main(String[] args){
        Integer [] ints = {1,2,4,7,9,11,8,65,109};
        ArrayList<Integer> myArray = new ArrayList<>(List.of(ints));
        String words ="I would not, could not, in a box. " +
                "I would not, could not with a fox." +
                " I will not eat them in a house." +
                " I will not eat them with a mouse.";
        ArrayList<String> myStringArray= new ArrayList<>(Arrays.asList(words.split(" ")));
        System.out.println("Please enter number of letters to find.");
        Scanner input = new Scanner (System.in);
        int numLetters=input.nextInt();

        System.out.println(sumOfEven(myArray));
        printWordsByCount(myStringArray, numLetters);
    }

    public static Integer sumOfEven(ArrayList<Integer> array){
        Integer total =0;
        for(Integer integer:array){
            if (integer % 2 == 0){
                total += integer;
            }
        }
        return total;
    }
}
