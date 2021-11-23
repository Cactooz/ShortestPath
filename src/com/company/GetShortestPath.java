package com.company;

public class GetShortestPath {
	
	//Get the stations passed in the shortest path
	public static int[] Stations(float[] a, float[][] b, float[] c) {
		//Set the minDistance to the first elements length
		float minDistance = a[0] + b[0][0] + c[0];
		
		//Make a new array to store the stations
		int[] path = new int[2];
		
		//Loop though all the possible paths
		for (int m = 0; m < a.length; m++) {
			for (int n = 0; n < c.length; n++) {
				float distance = a[m] + b[m][n] + c[n];
				
				//Replace the stations if the current distance is smaller
				if (distance < minDistance) {
					path[0] = m;
					path[1] = n;
				}
			}
		}
		return path;
	}
	
	//Get the distance of the shortest path
	public static float Distance(float[] a, float[][] b, float[] c) {
		//Get the stations needed
		int[] stations = Stations(a, b, c);
		
		//Return the distance
		return a[stations[0]]+b[stations[0]][stations[1]]+c[stations[1]];
	}
}
