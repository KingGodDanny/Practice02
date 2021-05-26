package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요");
		System.out.print("금액: ");
		double sum = sc.nextDouble();
		
		if (sum>=0 && sum<=1000) {
			System.out.println("소득세는 " + 0.09*sum + " 입니다.");
		} else if (sum>1000 && sum<=4000) {
			System.out.println("소득세는 " + ((1000*0.09)+0.18*(sum-1000)) + " 입니다.");
		} else if (sum>4000 && sum<8000) {
			System.out.println("소득세는 " + ((1000*0.09)+(3000*0.18)+0.27*(sum-4000)) + " 입니다.");
		} else if (sum>=8000) {
			System.out.println("소득세는" + ((1000*0.09)+(3000*0.18)+(4000*0.27)+0.36*(sum-8000)) + " 입니다");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
		
		
		sc.close();

	}

}
