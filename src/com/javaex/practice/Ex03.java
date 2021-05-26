package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해주세요");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if (age > 20) {
			System.out.println("\"1번그룹\"");
		} else {
			System.out.println("\"2번그룹\"");
		}
		System.out.println("입니다.");
		
		sc.close();

	}

}

// 15, 19, 20, 21, 100 을 넣었을때 실행결과 

//15와 19를 넣었을때 정답 : 
/* 나이를 입력해주세요
   나이 : 15 or 19
   "2번그룹"
   입니다.
*/ 

//20과 21과 100을 넣었을때 정답 : 
/* 나이를 입력해주세요
 나이 : 20 or 21 or 100
 "1번그룹"
 입니다.
*/ 