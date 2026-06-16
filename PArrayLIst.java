import java.util.ArrayList;
public class PArrayLIst {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ahmad");
        names.add("Mohammad");
        names.add("Ali");
        names.add("omar");
        names.add("Emal-Hasanzada");
        
      
        names.set(3, "Eman");
        System.out.println(" \tThis is the for loop.");
        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        System.out.println("\t This is for -each loop.");

        for(String i : names){
            System.out.println(i);
        }
    }
    
}
