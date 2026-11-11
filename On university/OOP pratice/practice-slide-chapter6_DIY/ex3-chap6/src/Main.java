import java.util.*;

interface Message{
    public String getHeader();
    public void setHeader(String header);
    public String getBody();
    public void setBody(String body);
    public String getType();
    public void setType(String type);
    public void printMessage();
}

class TextMessage implements Message{
    private String header;
    private String body;
    private String type;

    public TextMessage(String header,String body){
        this.header = header;
        this.body = body;
        this.type = "text";
    }

    public String getHeader(){
        return header;
    }

    public void setHeader(String header){
        this.header = header;
    }

    public String getBody(){
        return body;
    }

    public void setBody(String body){
        this.body = body;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public void printMessage(){
        System.out.println("Type: " + type + "\nheader: " + header + "\nbody: " + body);
    }
}

class BinaryMessage implements Message{
    private String header;
    private String body;
    private String type;

    public BinaryMessage(String header,String body){
        this.header = header;
        this.body = body;
        this.type = "binary";
    }

    public String getHeader(){
        return header;
    }

    public void setHeader(String header){
        this.header = header;
    }

    public String getBody(){
        return body;
    }

    public void setBody(String body){
        this.body = body;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public void printMessage(){
        System.out.println("Type: " + type + "\nheader: " + header + "\nbody: " + body);
    }
}

class MessageProducer{
    private String name;

    public MessageProducer(String name){
        this.name = name;
    }

    public Message create(String type, String header, String body){
        if(type.equals("text")){
            return new TextMessage(header,body);
        }
        else if(type.equals("binary")){
            return new BinaryMessage(header,body);
        }
        else{
            return null;
        }
    }

    public void send(Message msg, MessageConsumer consumer){
        if( msg != null){
            System.out.println(name + " sent the type of message " + msg.getType());
            consumer.receive(msg);
        }
        else{
            System.out.println("No message to send");
        }
    }
}

class MessageConsumer{
    private String name;
    private ArrayList<Message> inbox = new ArrayList<Message>();

    public MessageConsumer(String name){
        this.name = name;
    }

    public void receive(Message msg){
        inbox.add(msg);
        System.out.println(name + " received 1 message");
    }

    public void show(){
        System.out.println("----- " + name + "'s inbox -----");
        for(int i = 0; i< inbox.size(); i++){
            inbox.get(i).printMessage();
        }
    }
}

public class Main{
    public static void main(String[] args){
        MessageProducer producer = new MessageProducer("An");
        MessageConsumer consumer = new MessageConsumer("Binh");

        Message m1 = producer.create("text","Hello","Hello Henry");
        Message m2 = producer.create("binary","Data","101010");

        producer.send(m1, consumer);
        producer.send(m2, consumer);

        consumer.show();
    }
}