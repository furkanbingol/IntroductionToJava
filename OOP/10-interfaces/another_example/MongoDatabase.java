public class MongoDatabase implements IDatabase{

    @Override
    public void add() {
        System.out.println("MongoDB addition");
    }

    @Override
    public void delete() {
        System.out.println("MongoDB deletion");
    }

    @Override
    public void get() {
        System.out.println("MongoDB getting");
    }

    @Override
    public void update() {
        System.out.println("MongoDB updating");
    }
}
