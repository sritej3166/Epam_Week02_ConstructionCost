
public class CostEstimate {
	public double costcalculator(int standard,double area,boolean automation)
	{
		if(!automation)
		{
			if(standard==1) 
			{
				return 1200*area;
			}
			else if(standard==2)
			{
				return 1500*area;
			}
			else if(standard==3)
			{
				return 1800*area;
			}
		}
		else
		{
			return 2500*area;
		}
		return area;
	}
}
