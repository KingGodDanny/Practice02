package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int numone = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int numtwo = sc.nextInt();
		
		if (numone > numtwo) {
			System.out.println("몫: " + numone / numtwo);
			System.out.println("나머지: " + numone % numtwo);
		} else {
			System.out.println("몫: " + numtwo / numone);
			System.out.println("나머지: " + numtwo % numone);
		}
		
		sc.close();

	}

}
