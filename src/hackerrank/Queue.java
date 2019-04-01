package hackerrank;

import java.util.*;

/**
 * 
 * @author MANSI AGARWAL
 * Question: https://www.hackerrank.com/challenges/queue-using-two-stacks/problem
 */
public class Queue {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int choice = sc.nextInt();
			if (choice == 1) {
				stack1.push(sc.nextInt());
			} else if (choice == 2) {
				if (stack2.isEmpty()) {
					while (!stack1.isEmpty()) {
						stack2.push(stack1.pop());
					}
				}
				stack2.pop();
				while (!stack2.isEmpty()) {
					stack1.push(stack2.pop());
				}
			} else if (choice == 3) {
				if (stack2.isEmpty()) {
					while (!stack1.isEmpty()) {
						stack2.push(stack1.pop());
					}
				}
				System.out.println(stack2.peek());
				while (!stack2.isEmpty()) {
					stack1.push(stack2.pop());
				}
			}
		}
		sc.close();
	}
}
