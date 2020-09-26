public class Original extends Topping {
	Pizza pizza;
	
	public Original(Pizza pizza)
	{
	this.pizza = pizza;
	}

    public String getDescription() {
        return pizza.getDescription() + " Original sauce";
    }

    public int getCalories() {
        return super.getCalories() + 20;
    }
}
