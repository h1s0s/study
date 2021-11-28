package com.javaex.algorithm;

public class algorithm06 {

	public static void main(String[] args) {
		int[] arr1;
		int[] arr2 = {1,2,3};
		int[] arr3 = new int[5];
		int[] arr4 = {1,2,3,4,5};
		int[] arr5 = new int[5];
		
		//다차원 배열
		System.out.println("다차원 배열");
		String[][] arr6 = new String[3][3];

		arr6[0][0] = "0,0";
		arr6[0][1] = "0,1";
		arr6[0][2] = "0,2";
		arr6[1][0] = "1,0";
		arr6[1][1] = "1,1";
		arr6[1][2] = "1,2";
		arr6[2][0] = "2,0";
		arr6[2][1] = "2,1";
		arr6[2][2] = "2,2";
				
		
		System.out.print(arr6[0][0]+"\t");
		System.out.print(arr6[0][1]+"\t");
		System.out.println(arr6[0][2]);
		System.out.print(arr6[1][0]+"\t");
		System.out.print(arr6[1][1]+"\t");
		System.out.println(arr6[1][2]);
		System.out.print(arr6[2][0]+"\t");
		System.out.print(arr6[2][1]+"\t");
		System.out.println(arr6[2][2]);
		
		System.out.println("");
		int[][] arr7 = {{1,2,3}, {4,5,6}, {7,8,9}}; //3행3열
		
		System.out.print(arr7[0][0]+"\t");
		System.out.print(arr7[0][1]+"\t");
		System.out.println(arr7[0][2]);
		System.out.print(arr7[1][0]+"\t");
		System.out.print(arr7[1][1]+"\t");
		System.out.println(arr7[1][2]);
		System.out.print(arr7[2][0]+"\t");
		System.out.print(arr7[2][1]+"\t");
		System.out.println(arr7[2][2]);
		
	}

}
