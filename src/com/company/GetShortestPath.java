package com.company;

public class GetShortestPath {
	
	public static int[] Stations(float[] a, float[][] b, float[] c) {
		float minDistance = a[0] + b[0][0] + c[0];
		int[] path = new int[2];
		
		for (int m = 0; m < a.length; m++) {
			for (int n = 0; n < c.length; n++) {
				float distance = a[m] + b[m][n] + c[n];
				
				if (distance < minDistance) {
					path[0] = m;
					path[1] = n;
				}
			}
		}
		return path;
	}
	
	public static float Distance(float[] a, float[][] b, float[] c) {
		float minDistance = a[0] + b[0][0] + c[0];
		
		for (int m = 0; m < a.length; m++) {
			for (int n = 0; n < c.length; n++) {
				float distance = a[m] + b[m][n] + c[n];
				
				if (distance < minDistance) {
					minDistance = distance;
				}
			}
		}
		return minDistance;
	}
}
