public class Product {
    // declare variables
    public String description = "";
    public double price;

    // constructor method
    Product(String aDescription, double aPrice) {
        this.description = description;
        this.price = price;
    }

    // return string description
    public String getDescription() {
        return this.description;
    }

    // return the value of price
    public double getPrice() {
        return this.price;
    }

    public int evenCounts(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                counter++;
        }
        return counter;
    }
}
