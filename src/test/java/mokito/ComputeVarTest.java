package mokito;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ComputeVarTest 
{
	ComputeImplementation obj;
	int val3,val1,val2;
	iCompute mockobj;
	@Before
	public void setUp() throws Exception 
	{
		obj=new ComputeImplementation();
		val3=10;
		
		mockobj=Mockito.mock(iCompute.class);
		Mockito.when(mockobj.squareVar(val3)).thenReturn((int) Math.pow(val3, 2));
		obj.setObj(mockobj);
	}

	@After
	public void tearDown() throws Exception 
	{
		obj=null;
		mockobj=null;
	}

	@Test
	public void testSquare() {
		assertEquals((val3*val3),obj.squareVar(val3));
	}

}
