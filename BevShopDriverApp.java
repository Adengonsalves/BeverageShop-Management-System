import javax.swing.plaf.basic.BasicBorders;

public class BevShopDriverApp
{
	public static void main(String[] args) {

	BevShop order = new BevShop();
	int orderNumOne;
	int orderNumTwo;
	int orderNumThree;
	int orderIndex;
	
	System.out.println("Start a new order");
	order.startNewOrder(11, Day.SATURDAY, "Aden", 19);
	orderNumOne = order.getCurrentOrder().getOrderNo();
	System.out.println("Order Number: " + order.getCurrentOrder().getOrderNo());
	System.out.println(order.getCurrentOrder().getCustomer().getName());
	System.out.println(order.getCurrentOrder().getCustomer().getAge());
	System.out.println("Total on the order: " + order.getCurrentOrder().calcOrderTotal());
	System.out.println("Add a Smoothie to the order");
	order.processSmoothieOrder("Tropical Island", Size.LARGE, 3, false);
	System.out.println("Total on the order:" + order.getCurrentOrder().calcOrderTotal());
	if(order.isValidAge(order.getCurrentOrder().getCustomer().getAge()) == false)
	{
		System.out.println("Age not apporiate for ALCOHOLIC drink!!");
		System.out.println("Minimum AGE for Alcohol Drink: " + order.getMinAgeForAlcohol());
	}
	System.out.println("Number of Alcoholic Drinks:" + order.getNumOfAlcoholDrink());
	System.out.println("Total on the order:" + order.getCurrentOrder().calcOrderTotal());
	System.out.println("Add a Coffee to the order");
	order.processCoffeeOrder("Carmel Latte", Size.MEDIUM, true, true);
	System.out.println("Total on the order:" + order.getCurrentOrder().calcOrderTotal());
	
	
	
	System.out.println("\nStart a new order");
	order.startNewOrder(12, Day.SATURDAY, "Logan", 44);
	orderNumTwo = order.getCurrentOrder().getOrderNo();
	if(order.isValidTime(order.getCurrentOrder().getOrderTime()) == false)
	{
		System.out.println("Invalid Time!");
	}
	System.out.println("Order Number: " + order.getCurrentOrder().getOrderNo());
	System.out.println(order.getCurrentOrder().getCustomer().getName());
	System.out.println(order.getCurrentOrder().getCustomer().getAge());
	if(order.isEligibleForMore() == true)
	{
		if(order.isValidAge(order.getCurrentOrder().getCustomer().getAge()) == false)
		{
			System.out.println("Age not apporiate for ALCOHOLIC drink!!");
			System.out.println("Minimum AGE for Alcohol Drink: " + order.getMinAgeForAlcohol());
		}
		else {
			System.out.println("Add Alcoholic Drink");
			order.processAlcoholOrder("Pina Colda", Size.LARGE);
		}
		
	}
	else 
	{
		System.out.println("Maxium Number of Alcoholic Drinks: " + order.getMaxOrderForAlcohol());
	}
	System.out.println("Total on the order:" + order.getCurrentOrder().calcOrderTotal());
	System.out.println("Number of Alcoholic Drinks: " + order.getNumOfAlcoholDrink());
	
	if(order.isEligibleForMore() == true)
	{
		if(order.isValidAge(order.getCurrentOrder().getCustomer().getAge()) == false)
		{
			System.out.println("Age not apporiate for ALCOHOLIC drink!!");
			System.out.println("Minimum AGE for Alcohol Drink: " + order.getMinAgeForAlcohol());
		}
		else {
			System.out.println("Add Alcoholic Drink");
			order.processAlcoholOrder("Strawberry Daquri", Size.MEDIUM);
		}
		
	}
	else 
	{
		System.out.println("Maxium Number of Alcoholic Drinks: " + order.getMaxOrderForAlcohol());
	}
	System.out.println("Total on the order:" + order.getCurrentOrder().calcOrderTotal());
	System.out.println("Number of Alcoholic Drinks: " + order.getNumOfAlcoholDrink());
	
	if(order.isEligibleForMore() == true)
	{
		if(order.isValidAge(order.getCurrentOrder().getCustomer().getAge()) == false)
		{
			System.out.println("Age not apporiate for ALCOHOLIC drink!!");
			System.out.println("Minimum AGE for Alcohol Drink: " + order.getMinAgeForAlcohol());
		}
		else {
			System.out.println("Add Alcoholic Drink");
			order.processAlcoholOrder("Tequila", Size.SMALL);
		}
		
	}
	else 
	{
		System.out.println("Maxium Number of Alcoholic Drinks: " + order.getMaxOrderForAlcohol());
	}
	System.out.println("Total on the order:" + order.getCurrentOrder().calcOrderTotal());
	System.out.println("Number of Alcoholic Drinks: " + order.getNumOfAlcoholDrink());
	if(order.isEligibleForMore() == true)
	{
		if(order.isValidAge(order.getCurrentOrder().getCustomer().getAge()) == false)
		{
			System.out.println("Age not apporiate for ALCOHOLIC drink!!");
			System.out.println("Minimum AGE for Alcohol Drink: " + order.getMinAgeForAlcohol());
		}
		else {
			System.out.println("Add Alcoholic Drink");
			order.processAlcoholOrder("Magaritia", Size.MEDIUM);
		}
		
	}
	else 
	{
		System.out.println("Maxium Number of Alcoholic Drinks: " + order.getMaxOrderForAlcohol());
	}
	System.out.println("Total on the order:" + order.getCurrentOrder().calcOrderTotal());
	
	
	
	System.out.println("\nStart new order");
	order.startNewOrder(9, Day.FRIDAY, "Lauren", 17);
	orderNumThree = order.getCurrentOrder().getOrderNo();
	if(order.isValidTime(order.getCurrentOrder().getOrderTime()) == false)
	{
		System.out.println("Invalid Time!");
	}
	System.out.println("Order Number: " + order.getCurrentOrder().getOrderNo());
	System.out.println(order.getCurrentOrder().getCustomer().getName());
	System.out.println(order.getCurrentOrder().getCustomer().getAge());
	if(order.isEligibleForMore() == true)
	{
		if(order.isValidAge(order.getCurrentOrder().getCustomer().getAge()) == false)
		{
			System.out.println("Age not apporiate for ALCOHOLIC drink!!");
			System.out.println("Minimum AGE for Alcohol Drink: " + order.getMinAgeForAlcohol());
		}
		else {
			System.out.println("Add Alcoholic Drink");
			order.processAlcoholOrder("Tequila", Size.SMALL);
		}
		
	}
	System.out.println("Total on the order:" + order.getCurrentOrder().calcOrderTotal());
	System.out.println("Number of Alcoholic Drinks: " + order.getNumOfAlcoholDrink());
	System.out.println("Add Smoothie to order");
	order.processSmoothieOrder("Orange Dream", Size.MEDIUM, 4, true);
	System.out.println("Total on the order:" + order.getCurrentOrder().calcOrderTotal());
	System.out.println("Add Coffee to order");
	order.processCoffeeOrder("Americano", Size.MEDIUM, true, false);
	System.out.println("Total on the order:" + order.getCurrentOrder().calcOrderTotal());
	System.out.println("Add Smoothie to order");
	order.processSmoothieOrder("Green Machine", Size.LARGE, 3, true);
	System.out.println("Total on the order:" + order.getCurrentOrder().calcOrderTotal());
	
	
	System.out.println("\n\nTotal Number of Orders: " + order.totalNumOfMonthlyOrders());
	System.out.println("Total amount for all orders: " + order.totalMonthlySale());


	System.out.println("\n\n[Order Insights]\n\n");
	orderIndex = order.findOrder(orderNumOne);
	System.out.println(order.getOrderAtIndex(orderIndex) + "\n");
	System.out.println("Number of Smoothies Ordered: " + order.getOrderAtIndex(orderIndex).findNumOfBeveType(Type.SMOOTHIE));
	System.out.println("Number of Coffees Ordered: " + order.getOrderAtIndex(orderIndex).findNumOfBeveType(Type.COFFEE));
	System.out.println("Number of Alcohol Ordered: " + order.getOrderAtIndex(orderIndex).findNumOfBeveType(Type.ALCOHOL));
	System.out.println("Total Price of this order:" + order.totalOrderPrice(order.getOrderAtIndex(orderIndex).getOrderNo()));

	
	orderIndex = order.findOrder(orderNumTwo);
	System.out.println("\n\n" + order.getOrderAtIndex(orderIndex) + "\n");
	System.out.println("Number of Smoothies Ordered: " + order.getOrderAtIndex(orderIndex).findNumOfBeveType(Type.SMOOTHIE));
	System.out.println("Number of Coffees Ordered: " + order.getOrderAtIndex(orderIndex).findNumOfBeveType(Type.COFFEE));
	System.out.println("Number of Alcohol Ordered: " + order.getOrderAtIndex(orderIndex).findNumOfBeveType(Type.ALCOHOL));
	System.out.println("Total Price of this order:" + order.totalOrderPrice(order.getOrderAtIndex(orderIndex).getOrderNo()));

	
	
	orderIndex = order.findOrder(orderNumThree);
	System.out.println("\n\n" + order.getOrderAtIndex(orderIndex) + "\n");
	System.out.println("Number of Smoothies Ordered: " + order.getOrderAtIndex(orderIndex).findNumOfBeveType(Type.SMOOTHIE));
	System.out.println("Number of Coffees Ordered: " + order.getOrderAtIndex(orderIndex).findNumOfBeveType(Type.COFFEE));
	System.out.println("Number of Alcohol Ordered: " + order.getOrderAtIndex(orderIndex).findNumOfBeveType(Type.ALCOHOL));
	System.out.println("Total Price of this order:" + order.totalOrderPrice(order.getOrderAtIndex(orderIndex).getOrderNo()));
	
	
	
	
	

}
}




