package edu.usfca.cs.cs245;

public class FactorailIterative implements Factorial{
	public int factorial(int n){
		int total = 1;
		for(int i = n; i > 0; i--)
			total *= i;
		return total;
	}
}
