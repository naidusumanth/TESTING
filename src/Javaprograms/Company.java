package Javaprograms;

public interface Company
{
	default double profit(double cp,double sp)
	{
	
		return cp-sp;
		
	}
	static String cname(Company c)
	{
		
		System.out.println("The Profit For The  Company= "+c.profit(10000, 4000));
		return "My Company";
	}
	

}


