package mokito;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ComputeTaxTest {
	ComputeImplementation obj;
	double val1,val2;
	iCompute mockobj;

	@Before
	public void setUp() throws Exception {
		
		obj=new ComputeImplementation();
		val1=1000;
		val2=val1*0.17;
		mockobj=Mockito.mock(iCompute.class);
		Mockito.when(mockobj.computeTax(val2)).thenReturn((int) (val1*0.17));
		obj.setObj(mockobj);
	}

	@After
	public void tearDown() throws Exception {
		obj=null;
		mockobj=null;
	}

	@Test
	public void computetax() {
			assertEquals((val1*0.17),obj.computeTax(val2),0);
	}

}
