package testFrais;

import java.io.IOException;

public class CalculFrais  {
	
	private double limit1;
	private double limit2;
	private MonException e;
	

	
	public CalculFrais(paramAppli param)
	{
		limit1 = param.getLimit1();
		limit2 = param.getLimit2();
	}
	public CalculFrais() {
		limit1 = 200;
		limit2 = 500;
	}
	public double montant(double total) throws MonException
	{
		
		if (total <= 0)
			throw new MonException("negative value impossible");
		if (total >= limit2)
			return 0.0;
		else if (total >= limit1)
			return 20.0;
		else 
			return 30.0;
	}
	
	
	
}
