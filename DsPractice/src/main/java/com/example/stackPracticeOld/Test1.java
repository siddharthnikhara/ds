package com.example.stackPracticeOld;

public class Test1 {

	public int Prec(char ch) {
		switch (ch) {
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

	public static String infixToPostfix(String exp) {
		String result = "";
		Stack stack = new Stack();
		return result;
	}

}
