import java.util.ArrayList;

public class Main {
    public static int sum(ArrayList<Integer> list) {
        // write your code here
        Integer sum = 0;
        for (int numb : list) {
            sum = sum + numb;
        }
        return sum;
    }
    public static double average(ArrayList<Integer> list) {
        Integer impoNumber = sum(list);
        Double howManyNumbers = 0.0;
        for(Integer number : list){
            howManyNumbers++;
        }
        double result = impoNumber/howManyNumbers;
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        System.out.println(sum(list));
        System.out.println(average(list));
        System.out.println("The average is: " + average(list));
    }
}
