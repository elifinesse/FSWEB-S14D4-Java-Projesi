package Product;

public class Chocolate extends ProductForSale{
    private boolean isMilkChocolate;
    private boolean isDarkChocolate;

    public Chocolate(String type, double price, String description, boolean isMilkChocolate, boolean isDarkChocolate){
        super(type, price, description);
        this.isMilkChocolate = isMilkChocolate;
        this.isDarkChocolate = isDarkChocolate;
    }

    public boolean isMilkChocolate() {
        return isMilkChocolate;
    }

    public boolean isDarkChocolate() {
        return isDarkChocolate;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + " Price: " + getPrice() + " Description: " + getDescription() + " Milk chocolate: " + isMilkChocolate() + " Dark chocolate: " + isDarkChocolate());
    }
}
