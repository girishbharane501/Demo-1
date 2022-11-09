package com.scanner;

import java.util.Scanner;

public class EvenNo {

	public static void main(String[] args) {
Scanner scanner =new Scanner(System.in);
System.out.println("Enter the number From you want Even no.");
int start=scanner.nextInt();
System.out.println("Enter the number upto you want Even no");
int end=scanner.nextInt();
System.out.print(" Even numbers From " +start+ " to " +end+ " are ");
for(int i=start;i<=end;i++) {
	if(i%2==0) {
		System.out.print(","+i);
	}
}
	}

}
