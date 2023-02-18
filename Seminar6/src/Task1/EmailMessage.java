package Task1;

public class EmailMessage implements IMessage {
    @Override
    public void sendMessage(String typeMessage,String message){
        if(typeMessage.equals("e-mail")){
            //e-mail
            //use javaMailSenderApi
        }
    }
}
