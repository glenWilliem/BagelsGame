package main;

import java.util.Random;
import java.util.Scanner;

public class Main {
	Scanner input = new Scanner(System.in);
	Random random = new Random();
	String enter;
	int exit1;
	int answer,playerAnswer;
	int answer1,answer2,answer3;
	int input1,input2,input3;
	int tries;
	

	public Main() {
		
		do {
			System.out.println("Welcome To Bagels");
			System.out.println("Created by glenWilliem");
			System.out.println("Type Y to Continue");
			System.out.print(">");
			enter = input.nextLine();
			
		} while (!enter.equalsIgnoreCase("Y"));
	
		gameStart();
			
	}
	
	public void gameStart() {
		
		secretNumber();
		System.out.println("Random Number has been generated");
		do {

			System.out.print("Guess The Number (Not Start With 0) :");
			playerAnswer = input.nextInt();input.nextLine();
			
			checkAnswer();
			
			
		} while (playerAnswer != answer);

		
	}
	
	public void secretNumber() {
		
		do {
			answer = random.nextInt(900)+100;
			answer1 = answer/100;
			answer2 = (answer%100)/10;
			answer3 = (answer%100)%10;
			
		} while ((answer1 == answer2) || (answer2 == answer3) || (answer3 == answer1)) ;
		
	}
	
	public void checkAnswer() {
		if (answer  == playerAnswer) {
			System.out.println("Congratulations you have guess the number!");
			System.exit(exit1);
		}else {
			input1 = (playerAnswer)/100;
			input2 = (playerAnswer%100)/10;
			input3 = (playerAnswer%100)%10;
		}
		
		if (input1 == answer1) {
			System.out.println("Fermi");
		}
		if (input2 == answer2) {
			System.out.println("Fermi");
		}
		if (input3 == answer3) {
			System.out.println("Fermi");
		}
		if (input2 == answer1) {
			System.out.println("Pico");
		}
		if (input3 == answer1) {
			System.out.println("Pico");
		}
		if (input1 == answer2) {
			System.out.println("Pico");
		}
		if (input3 == answer2) {
			System.out.println("Pico");
		}
		if (input1 == answer3) {
			System.out.println("Pico");
		}
		if (input2 == answer3) {
			System.out.println("Pico");
		}
		else if (input1 != answer1 && input1 != answer2 && input1 !=answer3 &&
				input2 != answer1 && input2 != answer2 && input2 != answer3 &&
                input3 != answer1 && input3 != answer2 && input3 != answer3) {
			System.out.println("BAGELS");
		}
	}
	

	public static void main(String[] args) {
		new Main();	

	}

}
