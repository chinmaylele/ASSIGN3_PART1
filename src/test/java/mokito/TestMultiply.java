package mokito;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestMultiply 
{
	ComputeImplementation obj;
	int val1,val2;
	iCompute mockobj;
	@Before
	public void setUp() throws Exception 
	{
		obj=new ComputeImplementation();
		val1=10;
		val2=20;
		
		mockobj=Mockito.mock(iCompute.class);
		Mockito.when(mockobj.multiply(val1,val2)).thenReturn(val1*val2);
		obj.setObj(mockobj);
	}

	@After
	public void tearDown() throws Exception 
	{
		obj=null;
		mockobj=null;
	}

	@Test
	public void testMultiply() {
		assertEquals((val1*val2),obj.multiply(val1,val2));
	}

}
