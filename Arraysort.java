import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Arraysort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
           ArrayList<Integer> numbers = new ArrayList<Integer>();
            
           int sum = 0; 
           for(int i = 0 ;i <5; i++){
            System.out.println("Enter number : " + (i + 1) + ": ");
            int num = input.nextInt();

            numbers.add(num);
           }
           
           
           for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
            sum += numbers.get(i);
           }
             Collections.sort(numbers);

             Collections.max(numbers);
                
             Collections.min(numbers);
             System.out.println("sort of List : " + numbers);
             System.out.println("Larged: " + Collections.max(numbers) );
             System.out.println("Smallid: " + Collections.min(numbers));
             System.out.println("the sum number is: " + sum);
          

    }
    
}
