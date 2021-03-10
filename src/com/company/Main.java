package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyChar myChar = new MyChar('a');
        MyChar myChar1 = new MyChar('2');
        System.out.println(myChar.isVowel());
        System.out.println(myChar1.isNumber());
        System.out.println(myChar1.isDigit());
        System.out.println(myChar1.isAlphabet());
        System.out.println(myChar1.isConsonant());
        MyChar.printLowerCaseAlphabet();
        MyChar.printUpperCaseAlphabet();
    }
}
