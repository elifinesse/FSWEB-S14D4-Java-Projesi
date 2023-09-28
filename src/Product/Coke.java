package Product;

public class Coke extends ProductForSale{
    private int calories;

    public Coke(String type, double price, String description, int calories){
        super(type, price, description);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + " Price: " + getPrice() + " Description: " + getDescription() + " Calories: " + getCalories());
    }
}
