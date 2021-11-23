package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Set the width of the system
		int width = 2;
		//Make an array with the size of the width
		int[] height = new int[width];
	
		//Ask how many stations should be at each level
		for (int i = 0; i < width; i++) {
			System.out.print("Stationer på nivå " + (i+1) + ": ");
			height[i] = input.nextInt();
		}
		
		//Arrays to store the distance between all the stations
		float[] a = new float[height[0]];
		float[][] b = new float[height[0]][height[1]];
		float[] c = new float[height[1]];
		
		//Input the length between the stations
		System.out.println("Längd mellan stationerna");
		for (int m = 0; m < a.length; m++) {
			System.out.print("X -> U" + (m+1) + ": ");
			a[m] = input.nextFloat();
			for (int n = 0; n < c.length; n++) {
				System.out.print("U" + (m+1) + " -> V" + (n+1) + ": ");
				b[m][n] = input.nextFloat();
			}
		}
		
		//Input the length to the last station
		for (int n = 0; n < c.length; n++) {
			System.out.print("V" + (n+1) + " -> Y: ");
			c[n] = input.nextFloat();
		}
		
		//Print the result
		System.out.println("Kortaste vägen är: " + GetShortestPath.Distance(a,b,c));
		System.out.println("Stationerna är: U" + GetShortestPath.Stations(a,b,c)[0] + " och V" + GetShortestPath.Stations(a,b,c)[1]);
    }
}
