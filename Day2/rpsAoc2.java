package rpsElfs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class rpsAoc2 {
	protected static final int rock = 1;
	protected static final int paper = 2;
	protected static final int scissors = 3;
	protected static final int win = 6;
	protected static final int lose = 0;
	protected static final int draw = 3;
	
	public static int compareTo(char val1, char val2) {
		
		switch(val1) { //switch statement for value of opponent to compare to 
		case 'A': //rock
			switch(val2) {
			case 'X'://lose
				return lose+scissors;
			case 'Y'://draw
				return draw+rock;
			case 'Z'://win
				return win+paper;
			}
			break;
		case 'B'://paper
			switch(val2) {
			case 'X'://lose
				return lose+rock;
			case 'Y'://draw
				return draw+paper;
			case 'Z'://win
				return win+scissors;
			}
			break;
		case 'C'://scissors
			switch(val2) {
			case 'X'://lose
				return lose+paper;
			case 'Y'://draw
				return draw+scissors;
			case 'Z'://win
				return win+rock;
			}
			break;
		
		}
			
		return 0;
	}

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("rps.txt");
		Scanner scnr = new Scanner(file);
		int total = 0;
		while(scnr.hasNext()) {
			String line = scnr.nextLine();
			total += compareTo(line.charAt(0),line.charAt(2));
		}
		System.out.println(total);

	}

}
