
public class Alcohol extends Beverage {
	
	private boolean isWeekend;
	private final double addLarge = 1;
	private final double isWeekendFee = 0.60;
	private Type type;
	
	public Alcohol(String bevName, Size size, boolean isWeekend)
	{
		super(bevName,size);
		this.isWeekend = isWeekend;
	}
	
	public Alcohol(String bevName, Size size)
	{
		super(bevName, size);
		
	}
	
	
	@Override
	public Type getType()
	{
		return type = Type.ALCOHOL;
	}
	
	
	
	public boolean equals(Alcohol anotherBev)
	{
		
		if(getBevName().equals(anotherBev.getBevName()) && getSize().equals(anotherBev.getSize()) && getBasePrice() == anotherBev.getBasePrice() 
				&& isWeekend == anotherBev.isWeekend)
		{
			return true;
		}
		else
		{
			return false;
		}

	}

	
	public boolean isWeeknd()
	{
		if(isWeekend == true)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	@Override
	public double calcPrice() {
		double sum = 0;
		if(getSize() == Size.SMALL)
		{
			if(isWeekend == true)
			{
				sum = getBasePrice() + isWeekendFee;
			}
			else
			{
				sum = getBasePrice();
			}
			
		}
		
		else if(getSize() == Size.MEDIUM)
		{
			if(isWeekend == true)
			{
				sum = addSizePrice() + isWeekendFee;
			}
			else
			{
				sum = addSizePrice();
			}
			
		}
		
		
		else if(getSize() == Size.LARGE)
		{
			if(isWeekend == true)
			{
				sum = addSizePrice() + addLarge + isWeekendFee;
			}
			else {
				sum = addSizePrice() + addLarge;
			}
			
		}
		
		
		
		return sum;
	}
	
	
	
	public String toString()
	{
		
			if(isWeekend == true)
			{
				return "Name: " + getBevName() + ", Size: " + getSize() + ", In the Weekend";
			}
			else
			{
				return "Name: " + getBevName() + ", Size: " + getSize() + ", Not the Weekend";
			}
		

	}
	
	
	
	
	
	
	
	
	
	
	

}
