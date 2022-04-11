package com.CurrencyDenomination.controller;

import java.util.Arrays;
import java.util.Scanner;
import com.CurrencyDenomination.service.MergeSortImplementation;
import com.CurrencyDenomination.service.BubbleSortImplementation;
import com.CurrencyDenomination.service.NotesCount;

public class CurrencyDenomination {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("\n Enter the size of currency denominations:");
        // int size = sc.nextInt();
        // int[] denominations = new int[size];
        // System.out.println("\n Enter the currency denomination value(s):");
        // for(int i=0; i<size;i++){
        //     denominations[i] = sc.nextInt();
        // }

        // System.out.println("After Sorting :");
        // Arrays.sort(denominations);
        // for(int i=0;i<denominations.length;i++){
        //     System.out.println(denominations[i] + " ");
        // }

        // System.out.println("\n Enter the amount you want to pay :");
        // int payAmount = sc.nextInt();
        MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();

		System.out.println("enter the size of currency denominations ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency denominations value");
		for (int i = 0; i < size; i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("enter the amount you want to pay");
		int amount = sc.nextInt();
		mergeSortImplementation.sort(notes, 0, notes.length - 1);
		notesCount.notesCountImplementation(notes, amount);
        sc.close();
    }
}
