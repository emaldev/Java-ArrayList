import java.util.ArrayList;
public class Foods {
    public static void main(String[] args){
        ArrayList<String> foods = new ArrayList<String>();
        foods.add("Kabab");
        foods.add("khorshet");
        foods.add("Pizza");
        foods.add("Bolani");
        System.out.println(foods);

        System.out.println( "First Food: " + foods.get(0));
        System.out.println("Last Food: " + foods.get(3));
    }
    
}
