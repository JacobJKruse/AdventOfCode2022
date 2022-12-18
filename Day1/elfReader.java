package elfList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class elfReader {
	
	
	public static void main(String[] args) throws FileNotFoundException {
		int compare = 0; //compare value check
		int currentMax = 0; //current max for the top value
		int currentSnd = 0; //current second highest value
		int currentrd =  0;//current 3rd highest value
		File file = new File("elfList.txt");//input the text file 
		Scanner scnr = new Scanner(file); //use a scanner to read the file
		while(scnr.hasNextLine()) {//runs a loop till the entire file is read
			
			String str = scnr.nextLine();//uses the current line
			if(str =="") {//if the line is blank compare the values
				if(compare > currentMax) {//max
					currentrd = currentSnd;
					currentSnd = currentMax;
					currentMax = compare;
				}
				else if(compare > currentSnd) {//second
					currentrd = currentSnd;
					currentSnd = compare;
				}
				else if(compare > currentrd) {//third
					currentrd = compare;
				}
				
				compare = 0;
			}else {
				int in = Integer.parseInt(str); //otherwise keep adding to the the values
				compare += in;
			}
	
		}
		//outputs
		System.out.println(currentMax);
		System.out.println(currentSnd);
		System.out.println(currentrd);
		System.out.println(currentMax+currentSnd+currentrd);
		scnr.close();
	}

}
