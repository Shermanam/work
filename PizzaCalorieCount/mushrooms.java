public class mushrooms extends Topping {
	private Pizza pizza;
	
	public void mushrooms(Pizza pizza)
	{this.pizza = pizza;}

    public String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }

    public int getCalories() {
        return 5;
    }
}
