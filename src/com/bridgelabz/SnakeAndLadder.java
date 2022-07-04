package com.bridgelabz;

public class SnakeAndLadder {
	static int startPosition = 0;
	static int position = 0;
	static int winningPosition = 100;

	static int roll(int position) {
		
		int diceRoll = (int) (Math.random() * 6) + 1;
		System.out.println("The Rolled Dice is :" + diceRoll);
		int checkpoint = (int) (Math.random() * 3);
		System.out.println("Checkpoint :" + checkpoint);
		// 0 -> No Play
		// 1 -> Ladder
		// 2 -> Snake
		switch (checkpoint) {
		case 0:
			System.out.println("No Change in Position");
			break;
		case 1:
			if (position + diceRoll <= winningPosition) {
				position = position + diceRoll;
				System.out.println("The Ladder position is : " + position);
			}
			break;
		case 2:
			if (position - diceRoll <= 0)
				position = 0;
			else if (position - diceRoll > startPosition) {
				position = position - diceRoll;
				System.out.println("The Snake position is : " + position);
			}
			break;
		}
		
		
		System.out.println("Your position is " + position);
		System.out.println();
		return position;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Simulator Program");
		System.out.println("Single Player Start Position :" + startPosition);
		
		int player1 = 0;
		int player2 = 0;
		int turn = 1;
		int count = 0;
		while (player1 < winningPosition && player2 < winningPosition) {
			if (turn == 1) {
				System.out.println("Player-1 Playing");
				player1 = roll(player1);
				turn = 2;
			} else {
				System.out.println("Player-2 Playing");
				player2 = roll(player2);
				turn = 1;
			}
		count++;
		}
		System.out.println("Player-1 :" + player1);
		System.out.println("Player-2 :" + player2);
		if (player1 == 100) {
			System.out.println("Player-1 is the winner");
		} else {
			System.out.println("Player-2 is the winner");
		}
		System.out.println("The Diceroll times is " + count);
	}
}
