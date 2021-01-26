package com.suraj.string;

public class BasicString {

    public void declare(){
        String greeting = "Hello world!";
        System.out.println("Type 1:- "+greeting);
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);
        System.out.println("Type 2:- "+helloString);
    }

    /**
     * String class has pre defined length()
     */
    public void length(){
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o' };
        String helloString = new String(helloArray);
        System.out.println("String is "+ helloString + " and string length is "+ helloArray.length);
    }

    /**
     * Difference between ASCII of upper & lower case is 32.
     * Ex. A - 65 & a - 97, so 97-65 is 32.
     */
    public String changeCase(String word){
        char[] wordChar = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if(wordChar[i] >= 65 && wordChar[i] <=90){ // For upper case to lower case
                wordChar[i] = (char) (wordChar[i] + 32);
            }else if(wordChar[i] >= 97 && wordChar[i] <=122){ // For lower case to upper case
                wordChar[i] = (char) (wordChar[i] - 32);
            }
        }
        return new String(wordChar);
    }

    public void vowelsConsonentCount(String word){
        char[] wordChar = word.toCharArray();
        int vCount = 0, cCount =0;
        for (int i = 0; i < wordChar.length; i++) {
            if(wordChar[i] == 'a' || wordChar[i] == 'A' ||
                    wordChar[i] == 'e' || wordChar[i] == 'E' ||
                    wordChar[i] == 'i' || wordChar[i] == 'I' ||
                    wordChar[i] == 'o' || wordChar[i] == 'O' ||
                    wordChar[i] == 'u' || wordChar[i] == 'U'){
                vCount++;
            }else if((wordChar[i] >= 65 && wordChar[i] <=90) ||
                    (wordChar[i] >= 97 && wordChar[i] <=122)){
                cCount++;
            }
        }
        System.out.println("There are "+vCount +" vowels and "+ cCount +" consonents in "+ word);
    }
}
