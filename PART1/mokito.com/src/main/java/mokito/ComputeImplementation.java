package mokito;

public class ComputeImplementation implements iCompute 
{
	iCompute obj;
	public int squareVar(int var) {
		
		return obj.squareVar(var);
	}

	public int multiply(int x, int y) 
	{
		
		return obj.multiply(x, y);
	}
	
	public int computeTax(double val1) 
	{
		
		return obj.computeTax(val1);
	}

	public int weekelySalary(int e_income) 
	{
		
		return obj.weekelySalary(e_income);
	}

	public int fortnightsalary(int e_income) 
	{
		
		return obj.fortnightsalary(e_income);
	}

	public int computeKiwisaver(double e_kiwioption) 
	{
		
		return obj.computeKiwisaver(e_kiwioption);
	}
	public void setObj(iCompute obj)
	{
		this.obj=obj;
	}

}
