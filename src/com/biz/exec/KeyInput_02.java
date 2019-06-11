package com.biz.exec;

import java.util.Scanner;

public class KeyInput_02 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		
		System.out.print("국가명(영문)입력 >> ");
		String ketStr =scan.nextLine();
		System.out.println(ketStr);
		
		if(ketStr.equalsIgnoreCase("KOREA")) {
			System.out.println("대한민국 사람이군요");
		} else if(ketStr.equalsIgnoreCase("USA")){
			System.out.println("미국 사람이군요");
		} else {
			System.out.println("잘 모르는 곳이네요");
			
		}
		
	}

}
