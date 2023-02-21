package SingleResponsibilityPrinciple;

//первый класс, осуществляющий работу с базой
public class OrderDatabaseRepository {
    private DBUtil db;

    public OrderDatabaseRepository(){
        db = DBUtil.create(Config.getDbConfig());
    }

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


