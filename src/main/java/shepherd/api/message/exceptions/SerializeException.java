package shepherd.api.message.exceptions;

public class SerializeException extends Exception {


    public SerializeException(Throwable e)
    {
        super(e);
    }


    public SerializeException(String e)
    {
        super(e);
    }

    public SerializeException() { }
}
