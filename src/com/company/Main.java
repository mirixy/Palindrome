package com.company;

public class Main {

    public static void main(String[] args) {
        /* Testing some Strings if it is in fact a palindrome
           with the methods below.
         */
        System.out.println(isPalindromString("anna"));
        System.out.println(isPalindromString("Kayak"));
        System.out.println(isPalindromString("Anal"));
        System.out.println(isPalindromString("James"));
        System.out.println(isPalindromString("Table"));
        /* This line won't be right
         */
        System.out.println(isPalindromString(""));
    }
    /* This method is comparing the text and put it in a lowercase
       to prevent it from failing due to a character being uppercase.
       Also it calls up the reverse method to store the reversed string in the variable reverse
     */
    private static boolean isPalindromString(String text) {
        String reverse = reverse(text).toLowerCase();
        if (text.toLowerCase().equals(reverse)) {
            return true;
        }
        return false;
    }
    /* This method just checks if the input given above is null or empty.
        If this is not the case it is reversing the text by removing the last character from the string
        and calls the reverse method again to get a substring and removing the last character from the string.
        Than it returns it to the isPalindromeString method.

     */
    private static String reverse(String input){
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.charAt(input.length() -1 ) + reverse(input.substring(0, input.length() - 1));
    }
}
