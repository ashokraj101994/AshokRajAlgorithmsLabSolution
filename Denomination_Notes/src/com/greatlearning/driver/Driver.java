package com.greatlearning.driver;

import java.util.Arrays;
import java.util.Scanner;

import com.greatlearning.services.Notes;
import com.greatlearning.services.Services;

public class Driver {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Services mergesort = new Services();
		Notes notescount = new Notes();
		System.out.println("Enter the total number of denominations");
		int totalDenominations = in.nextInt();
		int[] notes = new int[totalDenominations];
		System.out.println("enter currency denominations");
		for(int i=0;i<totalDenominations;i++) {
			notes[i]=in.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		
			int amount=in.nextInt();
		
		Services.mergeSort(notes,0,notes.length-1);
		System.out.println(Arrays.toString(notes));
        Notes.countImplementation(notes,amount);

}
}