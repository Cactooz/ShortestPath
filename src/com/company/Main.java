package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		//System.out.print("Hur många steg av stationer: ");
		//int width = input.nextInt();
		int width = 2;
		int[] height = new int[width];
	
		for (int i = 0; i < width; i++) {
			System.out.print("Stationer på nivå " + (i+1) + ": ");
			height[i] = input.nextInt();
		}
		
		float[] a = new float[height[0]];
		float[][] b = new float[height[0]][height[1]];
		float[] c = new float[height[1]];
		
		System.out.println("Längd mellan stationerna");
		for (int m = 0; m < a.length; m++) {
			System.out.print("X -> U" + (m+1) + ": ");
			a[m] = input.nextFloat();
			for (int n = 0; n < c.length; n++) {
				System.out.print("U" + (m+1) + " -> V" + (n+1) + ": ");
				b[m][n] = input.nextFloat();
			}
		}
		
		for (int n = 0; n < c.length; n++) {
			System.out.print("V" + (n+1) + " -> Y: ");
			c[n] = input.nextFloat();
		}
    }
}
