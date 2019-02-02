/**************************************************
Name            Dustin Sumarli
Class           CS& 141B
Term            Winter 2019
Assignment 4    Counts Vowels and Consonants
Description     This program counts the number of vowels and consonants of a
                given input.   
**************************************************/
// Counts the amount of vowels and consonants of a given input.

import java.util.Scanner;
public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt for string (also turns the string into lowercase characters)
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        s = s.toLowerCase();
        
        // Declare acculumators
        int vowels = 0;
        int consonants = 0;
        
        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            // count vowels
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') { // check if letter
                consonants++;
            } // end if
        } // end for
        
        // Display results
        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);
    } // end main
} // end class
