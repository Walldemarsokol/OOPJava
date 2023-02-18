package Task1;

public class SmsMessage implements IMessage{
    @Override
    public void sendMessage(String typeMessage,String message){
        if(typeMessage.equals("SMS")){
            //sms
        }
    }
}
