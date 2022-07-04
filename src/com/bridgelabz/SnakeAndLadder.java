package com.bridgelabz;

public class SnakeAndLadder {
	public static void main(String[] args) {

		System.out.println("Welcome to Snake and Ladder Simulator Program");
		int startPosition = 0;
		System.out.println("Single Player Start Position :" + startPosition);
		int diceroll = (int) (Math.random() * 6) + 1;
		System.out.println("The Rolled Dice Value is :" + diceroll);
	}
}
