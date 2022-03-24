class DatabaseManager
{
    public void AddDatabase(IDatabase database)
    {
        database.add();
    }
    public void DeleteDatabase(IDatabase database)
    {
        database.delete();
    }
    public void GetDatabase(IDatabase database)
    {
        database.get();
    }
    public void UpdateDatabase(IDatabase database)
    {
        database.update();
    }
}

public class Main {
    public static void main(String[] args) {
        DatabaseManager manager = new DatabaseManager();
        MysqlDatabase Mysql = new MysqlDatabase();
        MongoDatabase Mongo = new MongoDatabase();

        manager.AddDatabase(Mysql);
        manager.AddDatabase(Mongo);
        manager.DeleteDatabase(Mysql);
    }
}
