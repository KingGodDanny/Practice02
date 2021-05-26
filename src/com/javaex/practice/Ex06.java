package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요");
		
		System.out.print("숫자1: ");
		int numone = sc.nextInt();
		System.out.print("숫자2: ");
		int numtwo = sc.nextInt();
		
		if (numone > numtwo) {
			System.out.print("큰수: " + numone + " 작은수: " + numtwo + "입니다.");
		} else {
			System.out.print("큰수: " + numtwo + " 작은수: " + numone + "입니다.");
		}
		
		
		sc.close();

	}

}
