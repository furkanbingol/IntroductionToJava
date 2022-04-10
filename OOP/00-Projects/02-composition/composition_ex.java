import java.util.ArrayList;
/*
aggregation(içerme)
composition(oluşturma)[stronger than aggregation]
*/
public class composition_ex {
    public static void main(String[] args) {
        House home = new House();  //COMPOSITION: if "home object" is deleted(null), rooms are deleted!
        
        System.out.println(home);  //overriding toString()
        System.out.println(home.getm2("Kitchen"));
        
        home = null;
        System.out.println(home);  //null!
        System.out.println(home.getm2("Kitchen")); //NullPointerException!
    }
}

class House{
    private Room r1,r2,r3;
    private ArrayList<Room> rooms;

    public House() {  //create room object in this Constructor(COMPOSITION)
        r1 = new Room("Living room","20 m2");
        r2 = new Room("Bed room","15 m2");
        r3 = new Room("Kitchen","10 m2");

        rooms = new ArrayList<Room>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
    }

    @Override
    public String toString() {
        String str = "";
        for(Room r : rooms)  //foreach
        {
            str = str + "Room: " + r.getRoom() + ", m2: " + r.getArea() + "\n";
        }
        return str;
    }

    public String getm2(String s) {
        for(Room r : rooms)
        {
            if(s.equals(r.getRoom())){
                return r.getArea();
            }
        }
        return "";
    }
}

class Room{
    private String room,area;

    public Room(String room, String area) {
        this.room = room;
        this.area = area;
    }

    public String getRoom() {
        return room;
    }

    public String getArea() {
        return area;
    }
}
