package shepherd.api.message.exceptions;

public class MessageException extends Exception {

    public MessageException(Throwable e)
    {
        super(e);
    }

    public MessageException(String e)
    {
        super(e);
    }

    public MessageException()
    {
        super();
    }
}
