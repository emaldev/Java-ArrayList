import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("BMW");
        cars.add("Saipa");
        cars.add("Mazda");
        cars.add("Lamborgini");
        System.out.println(cars);

        System.out.println("My fevorite car is " + cars.get(3));

    }
    
}
