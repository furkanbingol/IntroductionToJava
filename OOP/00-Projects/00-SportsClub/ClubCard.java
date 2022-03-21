public class ClubCard {
    private static int counter = 001; //('static') class'a ait, object'e ait değil!
    private final int ID;  //degistirilemez
    private double credit;
    Sports sp[] = new Sports[7];

    public ClubCard(double credit) {
        this.credit = credit;
        ID = counter;
        counter++;
    }

    public void registerCourse(Sports s) {
        for(int i = 0; i < sp.length; ++i)
        {
            if(sp[i] == null)
            {
                sp[i] = s;
                break;
            }
        }
        System.out.println("Registered to course: " + s.getName());
    }

    public void listCourses() {
        for(int i = 0; i < sp.length; ++i)
        {
            if(sp[i] != null)  //null pointer exception
                System.out.println(sp[i].getName());
        }
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        ClubCard.counter = counter; //class'a ait(static), object'e ait değil!
    }

    public int getID() {  //"final" oldugu icin setID yok, degistirilemez
        return ID;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
