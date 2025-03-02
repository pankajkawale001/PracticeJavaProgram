package com.lti.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStringKeepingSpecialCharacters {
	public static void main(String[] args) {
        String str1 = "Ab#cdefg@i";
        String reversed = reverseStringKeepingSpecialCharacters(str1);
        System.out.println(reversed); // Output: "ig#fedcb@A"
    }

    public static String reverseStringKeepingSpecialCharacters(String str) {
        // Convert the string to a list of characters
        List<Character> chars = str.chars()
                                    .mapToObj(c -> (char) c)
                                    .collect(Collectors.toList());

        // Create a list for storing non-special characters
        List<Character> letters = chars.stream()
                                       .filter(c -> Character.isLetter(c)) // Keep only letters
                                       .collect(Collectors.toList());
        
        // Reverse the letters
        List<Character> reversedLetters = new ArrayList<>(letters);
        Collections.reverse(reversedLetters);

        // Rebuild the string with reversed letters in the original positions
        StringBuilder result = new StringBuilder();
        int index = 0; // Index for reversed letters
        for (Character c : chars) {
            if (Character.isLetter(c)) {
                result.append(reversedLetters.get(index++)); // Append reversed letter
            } else {
                result.append(c); // Append special character
            }
        }
        return result.toString();
    }
}
