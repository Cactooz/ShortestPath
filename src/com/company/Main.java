package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Hur många steg av stationer: ");
		int width = input.nextInt();
		int height;
	
		for (int i = 0; i < width; i++) {
			System.out.print("Stationer på nivå " + (i+1) + ": ");
			height = input.nextInt();
		}
    }
}
