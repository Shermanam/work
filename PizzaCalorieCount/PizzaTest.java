
public class PizzaTest {

    /** Code to test Pizza **/
	public static void main(String[] args) {
        Pizza pizza = new OriginalCrust();
	pizza = new mushrooms(pizza);
        System.out.println("Description:  " + pizza.getDescription());
        System.out.println("Calories: " + pizza.getCalories());
    }
}
