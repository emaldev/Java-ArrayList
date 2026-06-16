import java.util.ArrayList;
import java.util.Collections;

public class sortArrayList {
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(12);
        number.add(24);
        number.add(90);
        number.add(45);
        number.add(110);
        number.add(67);

        System.out.println("Random list : " + number);

        Collections.sort(number);
        System.out.println("the sort list " + number);
    }
    
}
