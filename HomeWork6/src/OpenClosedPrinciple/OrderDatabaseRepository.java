package OpenClosedPrinciple;

//первый класс, осуществляющий работу с базой
public class OrderDatabaseRepository implements OrderRepository{
    private DBUtil db;

    public OrderDatabaseRepository(DBUtil db){
        this.db = db;
    }

    @Override
    public void saveOrder(Order o){
        Object[] params = {
                o.getUserId(),
                o.getProductId(),
                o.getProductCount()
        };

        db.execQuery(
                "INSERT INTO orders (user_id,product_id,product_count) VALUES (?,?,?)",
                params
        );
    }
}
