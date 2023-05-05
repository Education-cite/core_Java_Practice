package raf_Practice;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		
		int num1=60;
		int num2=24;
		int r ;

		
		while(num2!=0) {
			
			 r =num1%num2;
			num1=num2;
			num2=r;
			
		}
		
		System.out.println(num1);
		
	}

}
