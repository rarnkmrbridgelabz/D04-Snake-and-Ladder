package com.bridgelabz;

public class SnakeAndLadder {
	public static void main(String[] args) {

		System.out.println("Welcome to Snake and Ladder Simulator Program");

		int startPosition = 0;
		System.out.println("Single Player Start Position :" + startPosition);

		int position = 0;
		int winningPosition = 100;
		int count = 0;

		while (position < winningPosition) {

			int diceroll = (int) (Math.random() * 6) + 1;
			System.out.println("The Rolled Dice is :" + diceroll);
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
				if (position + diceroll <= winningPosition) {
					position = position + diceroll;
					System.out.println("The Ladder position is : " + position);
				}
				break;
			case 2:
				if (position - diceroll <= 0)
					position = 0;
				else if (position - diceroll > startPosition) {
					position = position - diceroll;
					System.out.println("The Snake position is : " + position);
				}
				break;
			}
			count++;
			System.out.println("The Diceroll times is " + count);
			System.out.println("Your position is " + position);
			System.out.println();

		}
	}
}
