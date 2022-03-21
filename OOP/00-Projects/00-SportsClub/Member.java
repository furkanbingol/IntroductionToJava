public class Member {
    private String name;
    private double credit;
    ClubCard card;

    public Member(String name, double credit) {
        this.name = name;
        this.credit = credit;
        card = new ClubCard(credit);
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", credit=" + credit +
                ", card=" + card +
                '}';
    }

    public void registerCourse(Sports s) {
        card.registerCourse(s);
    }

    public void listCourses() {
        card.listCourses();
    }

    public void getInfo()
    {
        System.out.println(getName() + ", ID: " + card.getID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
