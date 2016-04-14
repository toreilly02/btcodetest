import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Compare {
	//THIS PROGRAM CAN IMPORT FILE(DOES NOTHING WITH IT)
	//TAKES INPUT FROM USER ON CONSOLE
	//CREATES TWO STRINGS
	//SORTS THE STRING WITH THE PACKAGE NAMES ALPHABETICALLY
	
	public static void main (String[] args) 
	{
	
	try {
		Scanner File1 = new Scanner(new File("//Users//teresaoreilly//Desktop//packages.txt")).useDelimiter(",\\s*");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Scanner input = new Scanner(System.in);
	  System.out.print("Enter package name followed by ->");
		// get their input as a String
	    String userinput = input.next();
	    
	    
	   
	
	String [] names = {"gui->","swingui->","textui->","awtui->","runner->","extensions->"};
	String[] depend = {"awtui","swingui","textui","runner","extensions"};
	
	Arrays.sort(names);
	int i;
	for(i=0; i < names.length; i++){
		System.out.println("number: " + names[i]);
	} 
	//To access a specific element in an array list, use the get method 
	//and specify the index value (beginning with zero) of the element that you want to retrieve:
	}
	
}
