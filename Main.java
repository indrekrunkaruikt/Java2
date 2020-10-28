public class Main {

    public static class Product{
        String name = "";
        Double price = 0.0;
        Integer quantity = 0;
        public Product(String nameAtStart, double priceAtStart, int amountAtStart){
            this.name = nameAtStart;
            this.price = priceAtStart;
            this.quantity = amountAtStart;
        }
        public void printProduct(){
            System.out.println(this.name + ", price " + this.price + ", amount " + this.quantity);
        }
    }
    public static void main(String[] args) {
        Product banana = new Product("Banana", 1.1, 13);
        banana.printProduct();
    }
}