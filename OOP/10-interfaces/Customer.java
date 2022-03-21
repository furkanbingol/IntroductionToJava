public class Customer implements IDatabase{  //Customer implements IDatabase(interface)

    @Override
    public void log() {
        System.out.println("Customer added...");
    }
}
