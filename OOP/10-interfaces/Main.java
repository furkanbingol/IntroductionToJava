/*
Interfacesler bir çeşit class'tır.
Ancak interfaceslerden herhangi bir object "oluşturulamaz." Inheritance'den farkı da budur.
Interfacelerde 'default olarak tanımlanan' metotlara gövde verebiliriz, onun dışında Interfaceslerde gövdeli metodlar bulunmaz.
Interfacesler genellikle 'I' ile isimlendirilirler.
Interfaceslerde metodun imzasını veriyoruz, class kendisi yazıyor metodu.
Bir class'ın, bir interfacesteki metodları yazması gerektiğini söylemek : "implement"
 */

public class Main {
    public static void main(String[] args) {
        // IDatabase database = new IDatabase();  //ERROR(abstract)

        Customer customer = new Customer();
        IDatabase database1 = new Customer();     //polymorphism
        Student student = new Student();
        IDatabase database2 = new Student();      //polymorphism

        customer.log();
        database1.log();
        student.log();
        database2.log();
    }
}
