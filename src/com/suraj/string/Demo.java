package com.suraj.string;

public class Demo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.stringBasics();
    }

    public void stringBasics(){
        BasicString basicString = new BasicString();
        basicString.declare();
        basicString.length();
        System.out.println("Case change "+ basicString.changeCase("Welcome to Java World!"));
        basicString.vowelsConsonentCount("How are you?");
        System.out.println("Word count "+ basicString.wordCount("Are you enjoying    this code  ?"));
        System.out.println("Reverse of Reverse is "+ basicString.reverse("Reverse"));
        System.out.println("Reverse using binary search "+ basicString.reverseBinary("Reverse"));
        System.out.println("Mom is palindrome "+ basicString.palindrome("Mom") +" Java is palindrome "+basicString.palindrome("Java"));
    }

}
