import java.util.ArrayList;

public class Main {
    public static ArrayList<Integer> addNumbersToList(int num1, int num2, int num3){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(num1);
        list.add(num2);
        list.add(num3);
        return list;
    }
    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengthList = new ArrayList<Integer>();
        for(String word: list){
            lengthList.add(word.length());
        }

        return lengthList;
    }
    public static int greatest(ArrayList<Integer> list) {
        Integer theGreatestNumberThatHasEverExisted = 0;
        for(Integer number: list){
            if(theGreatestNumberThatHasEverExisted< number){
                theGreatestNumberThatHasEverExisted = number;
            }
        }
        // write your code here
        return theGreatestNumberThatHasEverExisted;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }
}