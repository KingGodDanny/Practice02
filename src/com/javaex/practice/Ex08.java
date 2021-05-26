package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		int numone = sc.nextInt();
		
		System.out.print("숫자2: ");
		int numtwo = sc.nextInt();
		
		System.out.print("숫자3: ");
		int numthr = sc.nextInt();
		
		if (numone < numtwo && numone < numthr) {
			System.out.println("가장 작은수는 " + numone + " 입니다.");
		} else if (numtwo < numone && numtwo < numthr) {
			System.out.println("가장 작은수는 " + numtwo + " 입니다.");
		} else {
			System.out.println("가장 작은수는 " + numthr + " 입니다.");
		}
		
		
		sc.close();
		
	}

}
