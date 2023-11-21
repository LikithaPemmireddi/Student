package com.cg.ExampleJUnit;

import java.util.Arrays;

public class AmntMinMaxFinder {

	public static void main(String[] args) {
		int[] a= {56,34,7,3,54,3,34,34,53};
		int[] m=findMinMax(a);
		Arrays.stream(m).forEach(System.out::println);

	}
public static int[] findMinMax(int[] arr) {
	int[] n= {Integer.MAX_VALUE,Integer.MIN_VALUE};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>n[1]) {
			n[1]=arr[i];
		}
		if(arr[i]<n[0]) {
			n[0]=arr[i];
		}
	}
	return n;
}

}