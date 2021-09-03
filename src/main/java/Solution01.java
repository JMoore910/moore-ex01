import java.util.Scanner;
/*
 *     UCF   COP3330  Fall 2021 Assignment 1 Solution01
 *     Copyright 2021 Sean Moore
 */
public class Solution01 {
    /*
    Create a Java Application that
     prompts the user for their name
     takes a name as input
     prints "Hello, <name>, nice to meet you!"
     Uses string concatenation
     */
    //Challenge: Use no variables
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("What is your name? ");
        String str;
        str = input.nextLine();
        System.out.println("Hello, ");
        System.out.println(str);
        System.out.println(", nice to meet you!");


        //Challenge 1 print Statement
        //replace 3 System outputs with this single line
        // System.out.println("Hello, " + input.nextLine() + ", nice to meet you!");
    }
}
