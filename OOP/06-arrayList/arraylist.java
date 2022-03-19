import java.util.ArrayList;

/* 
Array      = static
ArrayList  = dynamic 
-------------------------
add item        =  add()
access an item  =  get()
change an item  =  set()
remove an item  =  remove()
ArrayList Size  =  size()
What index is the item in =  indexOf()
*/

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> groups = new ArrayList<String>();
        
        groups.add("Metallica");
        groups.add("Iron Maiden");
        groups.add("Guns' n Roses");
        groups.add("Black Sabbath");
        
        groups.remove(1); //delete 1.index
        System.out.println("Size of ArrayList: " + groups.size());
        for(int i = 0; i < groups.size(); i++)
        {
            System.out.println(i + ".index: " + groups.get(i));
        }
        System.out.println(groups.indexOf("Metallica")); //returns 0
    }
}
