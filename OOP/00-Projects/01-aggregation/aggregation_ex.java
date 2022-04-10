import java.util.ArrayList;
/*
aggregation(içerme)
composition(oluşturma)[stronger than aggregation]
*/
public class aggregation_example {
    public static void main(String[] args) {
        Classroom sinif = new Classroom();
        Student s1 = new Student("01","Furkan");
        Student s2 = new Student("02","Ali");
        Student s3 = new Student("03","Ece");

        sinif.studentAdd(s1);
        sinif.studentAdd(s2);
        sinif.studentAdd(s3);

        System.out.println(sinif);  //override toString()
        System.out.println(s2);     //override toString()

        sinif = null;              //sinif deleted(null)
        System.out.println(sinif); //null
        System.out.println(s2);    //but student object that still exists(AGGREGATION)
    }
}

class Classroom{
    ArrayList<Student> students = new ArrayList<Student>();  //dynamic array

    public void studentAdd(Student s) {
        students.add(s);
    }

    @Override
    public String toString() {
        String str = "";
        for(Student s : students)  //foreach
        {
            str = str +  "Ogrencinin adi: " + s.getName() + " Ogrencinin numarasi: "+ s.getId() + "\n";
        }
        return str;
    }

}

class Student{
    private String id,name;  //Degiskenler private! Encapsulation yaparak, getter ve setter ile izin verilen bilgileri alabiliriz.

    public Student(String id, String name) {  //constructor
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Ogrenci adı: " + getName() + " Ogrenci numarasi: " + getId();
    }
}
