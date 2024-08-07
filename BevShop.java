
import java.util.ArrayList;

public class BevShop implements BevShopInterface {
	
	
	private ArrayList<Order> orders;
	private int numOfAlcDrinks = 0;
	private int indexOfOrder = 0;
	
	
	BevShop()
	{
		//creates arraylist
		orders = new ArrayList<Order>();
	}
	
	
	@Override
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		//creates a new customer
		Customer customer = new Customer(customerName,customerAge);
		//Starts a new order, and adds customer to it
		Order newOrder = new Order(time, day, customer);
		//adds to list
		orders.add(newOrder);
		//gets the index of the order in the list
		indexOfOrder = orders.indexOf(newOrder);
		//resets the count of alcoholic drink, because new order
		numOfAlcDrinks = 0 ;
	}

	@Override
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		//places the coffee order in the list at the index of the order 
		orders.get(indexOfOrder).addNewBeverage(bevName, size, extraShot, extraSyrup);
		
	}

	@Override
	public void processAlcoholOrder(String bevName, Size size) {
		//place alcohol order to the list at the index of the order 
		orders.get(indexOfOrder).addNewBeverage(bevName, size);
		//counts how many alcohol orders have been added, cant be over 3
		numOfAlcDrinks += 1;
		
	}

	@Override
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		//places smoothie order in the list at the index of the order
		orders.get(indexOfOrder).addNewBeverage(bevName, size, numOfFruits, addProtein);
	}
	
	@Override
	public String toString()
	{
		return "Total Number of All orders:" + totalNumOfMonthlyOrders() + " Total Monthly sale: " + totalMonthlySale();
	}
	
	

	@Override
	public boolean isValidTime(int time) {
		//if time greater than 23 and less than 8 
		if(time > MAX_TIME || time < MIN_TIME)
		{
			return false;
		}
		else
		{
			return true;
		}

	}

	@Override
	public int getMaxNumOfFruits() {
		
		return MAX_FRUIT;
	}

	@Override
	public int getMinAgeForAlcohol() {
		
		return MIN_AGE_FOR_ALCOHOL;
	}

	@Override
	public boolean isMaxFruit(int numOfFruits) {
		
		if(numOfFruits > MAX_FRUIT)
		{
			return true;
		}
		else
		{
		return false;
		}
	}

	@Override
	public int getMaxOrderForAlcohol() {
		return  MAX_ORDER_FOR_ALCOHOL;
	}

	@Override
	public boolean isEligibleForMore() 
	{
		//checks if num of Alcohol drinks is over 3
		if(numOfAlcDrinks == MAX_ORDER_FOR_ALCOHOL )
		{
			return false;
		}
		else 
		{
			return true;
		}
	}

	@Override
	public int getNumOfAlcoholDrink() {
		return numOfAlcDrinks;
	}

	@Override
	public boolean isValidAge(int age) {
	
		if(age >= MIN_AGE_FOR_ALCOHOL)
		{
			return true;
		}
		else {
			return false;
		}
			
		
		
		}



	@Override
	public int findOrder(int orderNo) {
		
		int status = -1;
		//search through Orders array to look for order with correspoinding orderNumber
		for(int i = 0; i < orders.size();i++)
		{
			if(orders.get(i).getOrderNo() == orderNo)
			{
				status = i;
				break;
			}
			
		}
		return status;
		
	}

	@Override
	public double totalOrderPrice(int orderNo) {
		//gets total price of an order with corresponding order number
		double sum =0;
		for(int i = 0; i < orders.size();i++)
		{
			if(orders.get(i).getOrderNo() == orderNo)
			{
				//gets the total of the order under that orderNo
				sum += orders.get(i).calcOrderTotal();
				break;
			}
			
		}
		return sum;
	}

	@Override
	public double totalMonthlySale() {
		//gets the total of ALL orders 
		double sum =0;
		for(int i = 0; i < orders.size();i++)
		{
			
			sum += orders.get(i).calcOrderTotal();
			
		}
		return sum;
		
	}

	@Override
	public int totalNumOfMonthlyOrders() 
	{
		//returns how many sepreate orders
		return orders.size();
	}

	@Override
	public Order getCurrentOrder() {
		//returns the current order.
		return orders.get(indexOfOrder);
	}

	@Override
	public Order getOrderAtIndex(int index) 
	{
		//returns the order at the corresponding index
		for( int i= 0; i < orders.size(); i++)
		{
			if( i == index)
			{
				Order orderAtIndex;
				orderAtIndex = orders.get(i);
				return orderAtIndex;
				
			}
		}
	return null;
		
	}

	@Override
	public void sortOrders() {
		
		for (int i = 0; i < orders.size(); i++) {
	        int min = i;
	        for (int k = i + 1; k < orders.size(); k++) {
	            if (orders.get(k).getOrderNo() < orders.get(min).getOrderNo()) {
	                min = k;
	            }
	        }
	        Order holder = orders.get(i);
	        orders.set(i, orders.get(min));
	        orders.set(min, holder);
	    }
		
		
	}
	
	
	
	
	
}		
		
		
		


