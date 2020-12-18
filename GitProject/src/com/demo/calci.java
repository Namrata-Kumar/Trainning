package com.demo;

class calci {
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	public static int diff(int num1, int num2) {
		return num1 - num2;
	}
	public static int div(int num1, int num2) {
		return num1 / num2;
	}

	public static void main(String args[]) {
		System.out.println("Add="+ add(10, 20));
		System.out.println("Diff="+ diff(10, 20));
		System.out.println("Division="+ div(10, 20));
	}
}
