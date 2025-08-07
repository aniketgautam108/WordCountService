package com;

public class WordCountService {

    public int LetterCount(String x) {
        char[] ch = x.toCharArray();
        int letter = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            }
        }
        return letter;
    }

    public int NumberCount(String x) {
        char[] ch = x.toCharArray();
        int num = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isDigit(ch[i])) {
                num++;
            }
        }
        return num;
    }

    public int SpaceCount(String x) {
        char[] ch = x.toCharArray();
        int space = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isSpaceChar(ch[i])) {
                space++;
            }
        }
        return space;
    }

    public static void main(String[] args) {
        WordCountService service = new WordCountService();
        
        // Sample string for testing
        String testString = "DevOps Project 2023";
        
        // Calculate counts
        int letters = service.LetterCount(testString);
        int numbers = service.NumberCount(testString);
        int spaces = service.SpaceCount(testString);
        
        // Print results
        System.out.println("Original String: \"" + testString + "\"");
        System.out.println("Letter count: " + letters);
        System.out.println("Number count: " + numbers);
        System.out.println("Space count: " + spaces);
        
        // Print total character count for verification
        System.out.println("Total characters: " + testString.length());
    }
}
