package com.cg.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecondTestingProgram 
{
	@Test
	void accept()
	{
		System.out.println("Hello Mam'm");
	}
	@Test
	@BeforeAll
	static void display()
	{
		System.out.println("@beforeAll-executes once before all the test methods in this class");
	}
	@Test
	@BeforeEach
	void print()
	{
		System.out.println("@beforeAll-executes  before each test methods in this class");
	}
	@Test
	void accep()
	{
		System.out.println(" Mam'm");
	}
}
