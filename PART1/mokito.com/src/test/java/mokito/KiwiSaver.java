package mokito;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import mokito.ComputeImplementation;
import mokito.iCompute;

public class KiwiSaver 
{

	ComputeImplementation obj;
	int val1;
	double val2;
	iCompute mockobj;
	@Before
	public void setUp() throws Exception 
	{
		obj=new ComputeImplementation();
		val1=100;
		val2=(val1*0.8);
		
		mockobj=Mockito.mock(iCompute.class);
		Mockito.when(mockobj.computeKiwisaver(val2)).thenReturn((int) ((int) val1*0.8));
		obj.setObj(mockobj);
	}

	@After
	public void tearDown() throws Exception 
	{
		obj=null;
		mockobj=null;
	}

	@Test
	public void kiwisaver() {
		assertEquals((val1*0.8),obj.computeKiwisaver(val2),0);
	}

}
