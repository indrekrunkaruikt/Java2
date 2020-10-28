import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Menu {
    private ArrayList<String> meals;
    public Menu() {
        this.meals = new ArrayList<String>();
    }
    public void addMeal(String meal){
        if(!meals.contains(meal)){
            meals.add(meal);
        }else{
            return;
        }
    }
    // Implement the methods here
    public void printMeals(){
        for (String item : meals){
            System.out.println(item);
        }
    }
    public void clear() {
        this.meals.clear();
    }
}
