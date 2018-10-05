package mokito;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class FortnightSalaryTest {

	ComputeImplementation obj;
	int val1;
	int val2;
	iCompute mockobj;
	@Before
	public void setUp() throws Exception 
	{
		obj=new ComputeImplementation();
		val1=2000;
		val2=(val1*12)/26;
		
		mockobj=Mockito.mock(iCompute.class);
		Mockito.when(mockobj.fortnightsalary(val2)).thenReturn((2000*12)/26);
		obj.setObj(mockobj);
	}

	@After
	public void tearDown() throws Exception 
	{
		obj=null;
		mockobj=null;
	}

	@Test
	public void fortnightsalary() {
		assertEquals(((val1*12)/26),obj.fortnightsalary(val2));
	}

}
