public abstract class Beverage {
	private String bevName;
	private Type type;
	private Size size;
	private final double basePrice = 2.0;
	private final double sizePrice = 1.0;
	
	public Beverage(String bevName, Size size)
	{
		this.bevName = bevName;
		this.size = size;
	}
	
	public Beverage(String bevName,Type type, Size size)
	{
		this.bevName = bevName;
		this.type = type;
		this.size = size;
	}
	
	
	public double getBasePrice()
	{
		return basePrice;
	}
	

	public Type getType()
	{
		return type;
	}

	public String getBevName()
	{
		return bevName;
	}
	
	public Size getSize()
	{
		return size;
	}
	
	public double addSizePrice()
	{
		return basePrice + sizePrice ;
	}
	
	public String toString()
	{
		return bevName + ": Size: " + size;
	}
	
	public boolean equals(Beverage anotherBev)
	{
		
		if(bevName.equals(anotherBev.bevName) 
				&& size.equals(anotherBev.size))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public abstract double calcPrice();
	
	
	
	
	
	
	

}
