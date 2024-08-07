import java.util.ArrayList;
import java.util.Random;

public class Order implements OrderInterface, Comparable<Order>

{
	private int orderTime;
	private Day orderDay;
	private Customer cust;
	private ArrayList<Beverage> list;
	private int orderNo;
	
	
	public Order(int orderTime, Day orderDay, Customer cust)
	{
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.cust = cust;
		//adds orderNumber == random number
		this.orderNo = generateOrder();
		this.list = new ArrayList<>();

	}
	
	
	
	public Customer getCustomer() {
		return cust;
	}

	public int getOrderNo()
	{
		return orderNo;
	}

	public int getOrderTime()
	{
		return orderTime;
	}
	
	public Day getOrderDay()
	{
		return orderDay;
	}
	
	public Day getDay()
	{
		return orderDay;
	}
	
	
	
	
	
	
	
	public int generateOrder()
	{
		this.orderNo = (int) (Math.random() * 80000) + 10000;
		return orderNo;
		
	}
	

	
	@Override
	public boolean isWeekend() {
		
		if(orderDay == Day.SATURDAY || orderDay == Day.SUNDAY)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public Beverage getBeverage(int itemNo) {
		// TODO Auto-generated method stub
		//search through array , to find the one with the same item numb
		Beverage bev = list.get(0);
		for(int i =0; i < list.size(); i++)
		{
			if(i == itemNo)
			{
				bev = list.get(i);
			}
		}
		return bev;
	}
	
	@Override
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		//creates new coffee and adds it to the list
		Coffee coffee = new Coffee(bevName,size,extraShot,extraSyrup);
		list.add(coffee);
		
		
	}

	@Override
	public void addNewBeverage(String bevName, Size size) {
		//creates new alcohol and adds it to the list
		Alcohol alcohol = new Alcohol(bevName,size,isWeekend());
		list.add(alcohol);
		
		
	}

	@Override
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		//creates new smoothie and adds it to the list
		Smoothie smoothie = new Smoothie(bevName,size,numOfFruits,addProtein);
		list.add(smoothie);
		
	}

	@Override
	public double calcOrderTotal() {
		//gets the total sum of the order total
		double sum = 0.0;
		for(int i = 0; i < list.size(); i++)
		{
			//goes through array and will calc price based on calc price in each class
			sum += list.get(i).calcPrice();
		}
		return sum;
	}

	@Override
	public int findNumOfBeveType(Type type) {
		//looks through the list and counts how many type are in it 
		int numOfBev = 0;
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getType() == type)
			{
				numOfBev += 1;
			}
		}
		return numOfBev;
	}

	public int getTotalItems()
	{
		//returns the number of orders in the order
		return list.size();
	}
	
	public String toString() {
		String toString = "Order Number:" + orderNo + " Order Time:" + orderTime + " Day:" + orderDay + " Customer:" + cust.getName()
		+ " Age:" + cust.getAge();
		
		for(int i =0; i < list.size(); i++)
		{
			toString += "\n" +list.get(i).toString();
		}
		return toString;
		

	}
	
	@Override
	public int compareTo(Order o) {
		//compares orderNumbers
		int status =0;
		if(orderNo == o.orderNo)
		{
			status = 0;
		}
		else if(orderNo > o.orderNo)
		{
			status = 1;
		}
		else if(orderNo < o.orderNo)
		{
			status = -1;
		}
		return status;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
