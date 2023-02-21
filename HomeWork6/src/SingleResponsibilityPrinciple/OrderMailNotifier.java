package SingleResponsibilityPrinciple;
//второй класс, отправляющий уведомления
public class OrderMailNotifier {
    private Mailer mailer;
    private final static String BOSS_EMAIL = "boss@example.com";

    public OrderMailNotifier(){
        mailer = new Mailer(Config.getSmtpConfig());
    }

    public void sendBossNotification(Order o){
        String message = "Создан заказ от пользователя "
                +o.getUserId()
                +" на товар "+o.getProductId()
                +" в количестве "+o.getProductCount();

        mailer.sendMessage(BOSS_EMAIL,message);
    }
}