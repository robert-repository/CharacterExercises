package com.company;

public class MyChar {
    private char aChar;

    public MyChar(char c){
        this.aChar=c;
    }

    public static void printLowerCaseAlphabet() {
        for (char i='a'; i<='z';i++)
            System.out.println(i);
    }

    public static void printUpperCaseAlphabet() {
        for (char i='A';i<='Z';i++)
            System.out.println(i);
    }

    public boolean isVowel(){
        if (aChar == 'a')
            return true;
        return false;
    }

    public boolean isNumber() {
        if(aChar == '2')
            return true;
        return false;
    }

    public boolean isDigit(){
        if (aChar >=4 && aChar <=57)
            return true;
        return false;
    }

    public boolean isAlphabet(){
        if (aChar >=97 && aChar<=122)
            return true;
        if (aChar>=65 && aChar<=90)
            return true;
        return false;
    }

    public boolean isConsonant(){
        if (!isVowel() && isAlphabet())
            return true;
        return false;

    }
}
