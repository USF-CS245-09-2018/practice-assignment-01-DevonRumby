package edu.usfca.cs.cs245;

public class FactorialRecursive implements Factorial {
	public int factorial(int n){
		int total;
		if(n == 1)
			return n;
		else
			total = factorial(n-1);
		return total * n;
	}
}
