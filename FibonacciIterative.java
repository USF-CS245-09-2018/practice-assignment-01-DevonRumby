package edu.usfca.cs.cs245;

public class FibonacciIterative implements Fibonacci{
	public int fibonacci(int n){
		int curr = 1;
		int pre = 0;
		int temp;
		for(int i = n; i > 1; i--){
			temp = curr;
			curr += pre;
			pre = temp;
		}
		return curr;
	}
}
