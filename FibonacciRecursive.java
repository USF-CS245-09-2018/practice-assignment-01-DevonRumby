package edu.usfca.cs.cs245;

public class FibonacciRecursive implements Fibonacci{
	public int fibonacci(int n){
		int curr;
		int pre;
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		else{
			curr = fibonacci(n-1);
			pre = fibonacci(n-2);
		}
		return curr + pre;
	}
}
