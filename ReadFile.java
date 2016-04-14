import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.JOptionPane;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;



public class ReadFile {
	//THIS PROGRAM IMPORTS TEXT FILE
	//TAKES INPUT FROM CONSOLE
	//PUTS FILE CONTENTS IN AN ARRAYLIST
	//convert array list to an array
	//sorts array alphabetically 
	//PRINTS OUT ARRAYLIST
	
	
	
	public static void main (String[] args) 
	{
	//PARSING COMMAND LINE
		//create new object
		Options options = new Options();
		//add option, first bit is the string to represent the option, the middle is a boolean to spec
		// specify if it requires an arguement or not
		// last is usage text
		options.addOption("gui",false,"checking for gui");
		
		//The parse methods of CommandLineParser are used to parse the command line arguments. There may be several implementations of the CommandLineParser interface, the recommended one is the DefaultParser.
		
		CommandLineParser parser = new DefaultParser();
		try {
			CommandLine cmd = parser.parse( options, args);
			
			if(cmd.hasOption("gui")){
				System.out.println("you have entered gui->");
			}else{
				System.out.print("Error");
			}
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		

	try {
		Scanner File1 = new Scanner(new File("//Users//teresaoreilly//Desktop//packages.txt")).useDelimiter(",\\s*");
		Scanner input = new Scanner(System.in);
		  System.out.print("Enter package name followed by ->");
			// get their input as a String
		    String userinput = input.next();
		 
	    
	    String token = "";
	    // create Scanner inFile1
	    

	
	    List<String> inputfile = new ArrayList<String>();

	    // while loop
	    while (File1.hasNext()) {
	      // find next line
	     token = File1.next();
	     inputfile.add(token);
	   }
	    File1.close();

	    String[] fileArray = inputfile.toArray(new String[0]);
	   
	    String[] importedFile = Arrays.copyOf(fileArray, fileArray.length,String[].class);
	    


	
	  
	   
	  
	    
	    Arrays.sort(importedFile);
		int i;
		for(i=0; i < importedFile.length; i++){
			System.out.println("number" + importedFile[i]);
		} 
		
		
		
	//System.out.print(msg);
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	
}

	
