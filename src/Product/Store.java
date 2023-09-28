package Product;
public class Store {
    public static void main(String[] args) {
        ProductForSale whiteChoc = new Chocolate("white chocolate", 30, "regular white chocolate", false, false);

        ProductForSale cokeZero = new Coke("coke zero", 20, "zero sugar", 1);

        ProductForSale lentilBread = new Bread("lentil bread", 40, "red lentils", true);

        ProductForSale[] products = {whiteChoc, cokeZero, lentilBread};

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products){
            product.showDetails();
        }
    }
}