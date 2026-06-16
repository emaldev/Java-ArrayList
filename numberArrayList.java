import java.util.ArrayList;
public class numberArrayList {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new  ArrayList<Integer>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
              
        int sum = 0; 
        System.out.println(" \t This is the for loops.");
        for(int i = 0; i < numbers.size(); i++ ){
            System.out.println(numbers.get(i));
            sum += numbers.get(i);
           

        }
         System.out.println("Sum of  ArrayList:  " + sum);

         System.out.println("\t This is the for - each loop. ");
         for(Integer i : numbers){
            System.out.println(i);
        
         }
        
    }
    
}
