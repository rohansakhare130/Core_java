package com.cg.patten;

import java.util.Scanner;

public class Exp_Star {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print("*"+" ");
		}
		s.close();
	}

}
