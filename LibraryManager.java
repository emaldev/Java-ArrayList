import java.util.ArrayList;


public class LibraryManager {
    public static void main(String[] args){
        ArrayList<String> bookName = new ArrayList<String>();

        bookName.add("C++ Programing");
        bookName.add("HTML Programing");
        bookName.add("Java Programing");
        bookName.add(0, "Python Basic");


        bookName.remove("HTML Programing");

        
        System.out.println(bookName);
        System.out.println("\t the for-each loop. ");
        for(String i : bookName){
            System.out.println(i);
        }
        if(bookName.contains("Java Programing")){
        System.out.println("Java Programing is in the list");
        }
    

    }
    
}
