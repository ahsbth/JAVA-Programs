package EXAMPREP;

public class AbstractMessagemain {
    public static void main(String[] args)
    {
        Textmessage t=new Textmessage();
        t.playMessage();
        Voicemessage v=new Voicemessage();
        v.playMessage();
        Faxmessage f=new Faxmessage();
        f.playMessage();
    }
}
abstract class Message{
    abstract void playMessage();
}
class Textmessage  extends Message{
    public void playMessage()
    {
        System.out.println("Good mornning");
    }
}
class Voicemessage extends Message{
    public void playMessage()
    {
        System.out.println("Hello Every one");
    }
  
}
class Faxmessage extends Message{
    public void playMessage()
    {
        System.out.println("How are you");
    }
}
