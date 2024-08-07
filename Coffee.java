/*
 * Class: CMSC203 
 * Instructor:
 * Description: Beverage Shop
 * Due: 12/10/22
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here:Aden Gonsalves
*/
public class Coffee extends Beverage 
{
	private boolean extraShot;
	private boolean extraSyrup;
	private final double addLarge = 1;
	private Type type;
	
	
	public Coffee(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		super(bevName, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
		
		
	}
	
	@Override
	public Type getType()
	{
		return type = Type.COFFEE;
	}
	
	public boolean equals(Coffee anotherBev)
	{
	if(getBevName().equals(anotherBev.getBevName()) && getSize().equals(anotherBev.getSize())
	&& extraShot == anotherBev.extraShot && extraSyrup == anotherBev.extraSyrup && calcPrice() == anotherBev.calcPrice()) 
		{
			return true;
		}
	else
	{
		return false;
	}
		
		
	}
	
	
	public boolean getExtraShot()
	{
		return extraShot;
	}
	
	public boolean getExtraSyrup()
	{
		return extraSyrup;
	}
	
	public String toString()
	{
		if(extraShot == true && extraSyrup == true)
		{
			return "Name: " + getBevName() + " Size: " + getSize() + ", Contains extra shot," + " Contiains extra Syrup";
		}
		else if(extraShot == true && extraSyrup == false)
		{
			return "Name: " + getBevName() + " Size: " + getSize() + ", Contains extra shot," + " No extra syrup";		
		}
		else if (extraShot == false && extraSyrup == true)
		{
			return  "Name: " + getBevName() + " Size: " + getSize() + ", Doesn't contain extra shot," + " Contains Extra syrup";		
		}
		else
		{
			return "Name: " + getBevName() + " Size: " + getSize() + ", Doesn't contain extra shot," + " No extra syrup";		

		}
	}



	
	@Override
	public double calcPrice() 
	{
		double sum =0;
		if(getSize() == Size.SMALL)
		{
			sum += getBasePrice();
			if(extraShot == true)
			{
				sum += .50;
			}
			if(extraSyrup == true)
			{
				sum += 0.50;
			}
			
		}
		
		else if(getSize() == Size.MEDIUM)
		{
			sum += addSizePrice();
			if(extraShot == true)
			{
				sum += .50;
			}
			if(extraSyrup == true)
			{
				sum += 0.50;
			}
			
		}
		
		
		else if(getSize() == Size.LARGE)
		{
			sum += addSizePrice() + addLarge;
			if(extraShot == true)
			{
				sum += .50;
			}
			if(extraSyrup == true)
			{
				sum += 0.50;
			}
		}
		
		
		return sum;
		
	}
	
	

}
