package shepherd.api.logger;


public abstract class ShepherdLoggerFactory {

    private final static LoggerFactoryWrapper loggerFactory =
            new LoggerFactoryWrapper();


    public final static void setLoggerFactory(ShepherdLoggerFactory factory)
    {
        loggerFactory.setWrapped(
                factory==null?NullLoggerFactory.DEFAULT:factory
        );
    }

    public final static ShepherdLoggerFactory factory()
    {
        return loggerFactory;
    }



    public abstract Logger getLogger(Object object);

}
