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
    }

}
