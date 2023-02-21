package OpenClosedPrinciple;

//второй класс, отправляющий уведомления
public class OrderMailNotifier implements OrderNotifier{
    private Mailer mailer;
    private final static String BOSS_EMAIL = "boss@example.com";

    public OrderMailNotifier(Mailer mailer){
        this.mailer = mailer;
    }

    @Override
    public void sendBossNotification(Order o){
        String message = "Создан заказ от пользователя "
                +o.getUserId()
                +" на товар "+o.getProductId()
                +" в количестве "+o.getProductCount();

        mailer.sendMessage(BOSS_EMAIL,message);
    }
}