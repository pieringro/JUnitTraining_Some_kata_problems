package com.pierprogramm.training.junit.codewars.morsecode;


public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        String output = "";
        morseCode = MorseCodeDecoder.prepareMorseCode(morseCode);
        output = MorseCodeDecoder.processWordsAndLetters(morseCode);
        return output;
    }

    private static String prepareMorseCode(String morseCode){
        morseCode = morseCode.trim();
        morseCode = morseCode.replace('/', ' ');
        return morseCode;
    }

    private static String processWordsAndLetters(String morseCode){
        String output = "";
        String[] morseWords = MorseCodeDecoder.explodeWords(morseCode);
        for(String aMorseWord : morseWords){
            output += MorseCodeDecoder.processLetters(aMorseWord) + " ";
        }
        output = output.substring(0, output.length()-1);
        return output;
    }

    private static String[] explodeWords(String morseCode){
        return morseCode.split("   ");
    }

    private static String processLetters(String aMorseWord){
        String output = "";
        String[] wordLetters = MorseCodeDecoder.explodeLetters(aMorseWord);
        for(String aLetter : wordLetters){
            String letter = MorseCode.get(aLetter);
            output += letter;
        }
        return output;
    }

    private static String[] explodeLetters(String morseWord){
        return morseWord.split(" ");
    }
}