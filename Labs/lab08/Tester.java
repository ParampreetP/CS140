package lab08;//bonus in Recursion.java class
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Tester {
	@Test
	public void factorialTest1()
	{
		assertEquals(24, Recursion.factorial(4));
	}
	@Test
	public void factorialTest2()
	{
		assertEquals(0, Recursion.factorial(0));
	}
	@Test
	public void factorialTest3()
	{
		assertEquals(1, Recursion.factorial(1));
	}
	@Test
	public void squarerootTest1()
	{
		assertEquals(0, Recursion.squareRoot(0));
	}
	@Test
	public void squarerootTest2()
	{
		assertEquals(9, Recursion.squareRoot(81), 1e-6);
	}
	@Test
	public void sumArraylist()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0,1);
		list.add(1,2);
		list.add(2,3);
		assertEquals(6, Recursion.sum(list));
	}
	@Test
	public void sumArraylist2()
	{
		int[] list = {1,2,3};
		
		assertEquals(6, Recursion.sum(list));
	}

	@Test
	public void binomialCoefficienttest1()
	{
		assertEquals(10, Recursion.binomialCoefficient(5,2));
	}
	@Test
	public void binomialCoefficienttest2()
	{
		assertEquals(4, Recursion.binomialCoefficient(4,1));
	}
	
}
