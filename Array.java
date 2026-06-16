
import java.util.ArrayList;
import java.util.Scanner;

public class Array{
    public static void main(String[] args){
        ArrayList<Integer> number = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
       

    
   
      
        for(int i = 0; i < 5; i++){
            System.out.println("Enter number " + (i + 1) + ": ");
            int num = input.nextInt();
            number.add(num);
    
        }
          int max = number.get(0);
        int sum = 0; 
        int min = number.get(0);
        for(int i = 0; i < number.size(); i++){
            System.out.println(number.get(i));
            int num = number.get(i);
            sum += number.get(i);
                         
            if(num > max){
                max = num;
            }
            if(num < min){
                min = num;
            }

        }
        
        System.out.println("Sum number is: " + sum);
        System.out.println("Largest: " + max);

        System.out.println("Smalist: " + min);

       
      
    }

}