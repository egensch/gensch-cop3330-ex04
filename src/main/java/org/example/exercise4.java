/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner inputQuote = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun = inputQuote.nextLine();

        System.out.print("Enter a verb: ");
        String verb = inputQuote.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = inputQuote.nextLine();

        System.out.print("Enter an adverb: ");
        String adverb = inputQuote.nextLine();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
