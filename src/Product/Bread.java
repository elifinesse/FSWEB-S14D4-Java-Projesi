package Product;

public class Bread extends ProductForSale{
    private boolean isGlutenFree;

    public Bread(String type, double price, String description, boolean isGlutenFree){
        super(type, price, description);
        this.isGlutenFree = isGlutenFree;
    }    

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + " Price: " + getPrice() + " Description: " + getDescription() + " Gluten free: " + isGlutenFree);
    }
}
