import java.util.ArrayList;

public class Main {
    public static void removeLast(ArrayList<String> list){
        int numberofListItems = 0;

        for (String word : list) {
            numberofListItems++;
        }
        numberofListItems = numberofListItems - 1;
        list.remove(numberofListItems);
    }
    public static void main(String[] args) {
        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");
        System.out.println("brothers:");
        System.out.println(brothers);
// sorting brothers
// removing the last item
        removeLast(brothers);
        System.out.println(brothers);
    }
}
