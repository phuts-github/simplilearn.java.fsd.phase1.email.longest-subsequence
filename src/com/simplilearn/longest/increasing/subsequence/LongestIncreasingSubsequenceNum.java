package com.simplilearn.longest.increasing.subsequence;

import java.util.ArrayList;
import java.util.Random;

public class LongestIncreasingSubsequenceNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int y = 99; // Random maximum / Array list limit
		ArrayList<Integer> randomArrayList = new ArrayList<Integer>();

//		Loading the array list with initial unique random values
		Random randomInt = new Random();
		while (randomArrayList.size() < y) {
				int i = randomInt.nextInt(y);
				if (!randomArrayList.contains(i)) {
					randomArrayList.add(i);
				}
		}

		// Printing array list contents and forcing line break after x number of lines printed
		int lineBreakerCount = 0, lineBreakNow = 20;
		System.out.println("\nBefore finding longest increasing subsequence numbers");
		System.out.println("\tArray length : " + randomArrayList.size());
		System.out.println("\tArray values :");
		System.out.print("\t\t");
		for (int arrayList : randomArrayList) {
			if (lineBreakerCount == lineBreakNow) {
				System.out.print("\n\t\t");
				lineBreakerCount = 0;
			}

			lineBreakerCount++;
			System.out.printf("%02d",arrayList);
			System.out.print(" ");
		}
		System.out.println();

		// Finding the longest increasing subsequence
		longestIncreasingSubsequence(randomArrayList);
	}
	
	private static void longestIncreasingSubsequence(ArrayList<Integer> randomArrayList){
		ArrayList<Integer> savedHighestIncreasingNum = new ArrayList<Integer>();
		ArrayList<Integer> savedHighestIncreasingIndexes = new ArrayList<Integer>();
		int savedHighestNum = -1;
		for (int arrayList : randomArrayList) {
			if (arrayList > savedHighestNum) {
				savedHighestNum = arrayList;
				savedHighestIncreasingIndexes.add(randomArrayList.indexOf(arrayList)); // Save the value's index number
				savedHighestIncreasingNum.add(savedHighestNum); // Save the actual value
			}
		}

		System.out.println("\nAfter finding longest increasing subsequence numbers");
		System.out.println("\tArray length : " + savedHighestIncreasingNum.size());
		System.out.print("\tArray values : ");
		for (int highestIncreasingNum : savedHighestIncreasingNum) {
			System.out.print(highestIncreasingNum + " ");
		}

		System.out.println("\n");
		System.out.println("\tIndex length : " + savedHighestIncreasingIndexes.size());
		System.out.print("\tIndex values : ");
		for (int highestIncreasingIndexes : savedHighestIncreasingIndexes) {
			System.out.print(highestIncreasingIndexes + " ");
		}
		System.out.println();
	}
}
