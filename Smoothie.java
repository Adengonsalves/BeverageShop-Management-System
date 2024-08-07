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
public class Smoothie extends Beverage 
{

	private int numOfFruits;
	private boolean addProtien;
	private final double protien = 1.5;
	private final double fruits = 0.50;
	private final double addLarge = 1;
	private Type type;
	
	
	public Smoothie(String bevName, Size size, int numOfFruits,boolean addProtien) {
		super(bevName, size);
		this.numOfFruits = numOfFruits;
		this.addProtien = addProtien;
		
	}
	@Override
	public Type getType()
	{
		return type = Type.SMOOTHIE;
	}

	public int getNumOfFruits() {
		return numOfFruits;
	}

	public boolean getAddProtien() {
		return addProtien;
	}
	
	public String toString()
	{
		if(addProtien == true)
		{
			return "Name:" + getBevName() + " Size: " + getSize() + ", Protien Added, " + "Number of fruiuts: " + numOfFruits;
		}
		else
		{
			return "Name:" + getBevName() + " Size: " + getSize() + ", No Protien Added, " + "Number of fruiuts: " + numOfFruits;
		}

	
	}

	public boolean equals(Smoothie anotherBev)
	{
		if(getBevName().equals(anotherBev.getBevName()) && getSize().equals(anotherBev.getSize()) && getBasePrice() == anotherBev.getBasePrice()
				&& numOfFruits == anotherBev.numOfFruits && addProtien == anotherBev.addProtien) 
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
		
		double sum =0;
		if(getSize() == Size.SMALL)
		{
			sum += getBasePrice();
			if(addProtien == true)
			{
				sum += protien;
			}
			sum += (numOfFruits * fruits);
		}
		
		else if(getSize() == Size.MEDIUM)
		{
			sum += addSizePrice();
			if(addProtien == true)
			{
				sum += protien;
			}
			sum += (numOfFruits * fruits);
			
		}
		
		
		else if(getSize() == Size.LARGE)
		{
			sum += addSizePrice() + addLarge ;
			if(addProtien == true)
			{
				sum += protien;
			}
			sum += (numOfFruits * fruits);
		}
		return sum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
