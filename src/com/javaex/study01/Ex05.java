package com.javaex.study01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간:");
		int time = sc.nextInt();
		if(time<=8) {
			System.out.println("임금은 "+(time*10000)+"원 입니다.");
		} else {
			int pay = ((time-8)*12000)+80000;
			System.out.println("임금은 "+pay+"원 입니다.");
		}
		
		sc.close();
	}
}
