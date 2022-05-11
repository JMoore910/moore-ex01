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
        //  Scanner for input
        
        Scanner input = new Scanner(System.in);
        
        //  Ask for name from user
        System.out.printf("What is your name? ");
        
        //  Take name as input and print it in a string concatenation
        String str;
        str = input.nextLine();
        System.out.println("Hello, " + str + ", nice to meet you!");
    }
}
