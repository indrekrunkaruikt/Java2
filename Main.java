public class Main {

    public static void main(String[] args) {
        Menu burgerid = new Menu();
        burgerid.addMeal("burger");
        burgerid.addMeal("hapukoor");
        burgerid.addMeal("nagits");
        burgerid.addMeal("salat");
        burgerid.printMeals();
        burgerid.clear();
        burgerid.printMeals();
    }
}