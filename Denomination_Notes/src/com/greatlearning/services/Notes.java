package com.greatlearning.services;

public class Notes {
 public static void countImplementation(int[] notes, int amount) {
	   int[] notesCount=new int[notes.length];
	  
	   for(int i=0;i<notes.length;i++) {
		   if(amount>=notes[i]) {
			   notesCount[i]=amount/notes[i];
			   amount = amount-notesCount[i]*notes[i];
		   }
	   }
	   if(amount>0) {
		   System.out.println("Exact amount cannot be given with the highest denominations");
	   }
	   else {
		   System.out.println("your payment approach to give min num of notes");
		   for(int i=0;i<notes.length;i++) {
		   if(notesCount[i]!=0) {
			   System.out.println(notes[i] + ":" + notesCount[i]);
		   }   
		 }
	   }
	 }
		 }
	   
	 
		
		 
	 
 

