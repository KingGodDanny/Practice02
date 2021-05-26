package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int numone = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int numtwo = sc.nextInt();
		
		if (numone > numtwo) {
			if (numone % numtwo == 0) {
				System.out.println(numtwo + " 는(은) " + numone + " 의 약수입니다." );
			} else {
				System.out.println(numtwo + " 는(은) " + numone + " 의 약수가 아닙니다." );
			}
			
		} else if (numtwo > numone) {
			if (numtwo % numone == 0) {
				System.out.println(numone + " 는(은) " + numtwo + " 의 약수입니다." );
			} else {
				System.out.println(numone + " 는(은) " + numtwo + " 의 약수가 아닙니다." );
			}
			
		}
		
		sc.close();
		
	}

}
