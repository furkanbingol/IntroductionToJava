public class SportsClub {
    public static void main(String[] args) {
        Sports s1 = new Sports("tennis",15,150);
        Sports s2 = new Sports("soccer",10,100);
        Sports s3 = new Sports("basketball",15,300);
        Member m1 = new Member("Elly West",500);
        Member m2 = new Member("Kevin Lore",400);
        m1.getInfo(); //ID: 001
        m2.getInfo(); //ID: 002
        System.out.println(m2);  //calls toString()

        m1.registerCourse(s3);
        m1.registerCourse(s1);
        System.out.println("\nList sports:");
        m1.listCourses();
    }
}
