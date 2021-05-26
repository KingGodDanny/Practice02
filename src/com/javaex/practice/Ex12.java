package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		
		System.out.print("기호: ");
		String sign = sc.nextLine();
		
		System.out.print("숫자1: ");
		int numone = sc.nextInt();
		
		System.out.print("숫자2: ");
		int numtwo = sc.nextInt();
		
		switch(sign) {
			case "+" : 
				System.out.println("결과는: " + (double)numone+numtwo);
				break;
				
			case "-" :
				System.out.println("결과는: " + (double)(numone-numtwo));
				break;
				
			case "*" : 
				System.out.println("결과는: " + (double)numone*numtwo);
				break;
				
			case "/" : 
				if(numtwo==0) {
				System.out.println("계산할 수 없습니다.");
				} else {
				System.out.println("결과는: " + (double)numone/numtwo); }
				break;
				
			default :
				System.out.println("계산할 수 없는 기호입니다.");
				break;
		}
		
		
 		sc.close();
		
	}
	
}
				
