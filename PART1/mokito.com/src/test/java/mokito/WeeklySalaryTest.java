package mokito;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import mokito.ComputeImplementation;
import mokito.iCompute;

public class WeeklySalaryTest 
{

	ComputeImplementation obj;
	int val1;
	iCompute mockobj;
	@Before
	public void setUp() throws Exception 
	{
		obj=new ComputeImplementation();
		val1=100;
		
		mockobj=Mockito.mock(iCompute.class);
		Mockito.when(mockobj.weekelySalary(val1)).thenReturn((int) val1*7);
		obj.setObj(mockobj);
	}

	@After
	public void tearDown() throws Exception 
	{
		obj=null;
		mockobj=null;
	}

	@Test
	public void weekelysalary() {
		assertEquals((val1*7),obj.weekelySalary(val1));
	}

}
