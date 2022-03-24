public class MysqlDatabase implements IDatabase{

    @Override
    public void add() {
        System.out.println("Mysql addition");
    }

    @Override
    public void delete() {
        System.out.println("Mysql deletion");
    }

    @Override
    public void get() {
        System.out.println("Mysql getting");
    }

    @Override
    public void update() {
        System.out.println("Mysql updating");
    }
}
