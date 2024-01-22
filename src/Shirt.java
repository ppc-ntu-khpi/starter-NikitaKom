public class Shirt {
    public int shirtID = 312515; 
    public String description = "Фірмова футболка Nirvana"; 
    public String color = "Black";
    public double price = 260.0; 
    public int quantityInStock = 10000; 

    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description:" + description);
        System.out.println("Color Code: " + color);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    }
} 