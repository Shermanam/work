
public abstract class Topping extends Pizza {
    private Pizza wrap;

    public void Topping(Pizza wrap) {
        this.wrap = wrap;
    }

    public String getDescription() {
        return wrap.getDescription();
    }

    public int getCalories() {
        return wrap.getCalories();
    }
}
