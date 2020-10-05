package shepherd.api.logger;


public abstract class LoggerFactory {

    private final static LoggerFactoryWrapper loggerFactory =
            new LoggerFactoryWrapper();


    public final static void setLoggerFactory(LoggerFactory factory)
    {
        loggerFactory.setWrapped(
                factory==null? NullLoggerFactory.DEFAULT:factory
        );
    }

    public final static LoggerFactory factory()
    {
        return loggerFactory;
    }

    public abstract LoggerFactory setLoggerConfigure(LoggerConfigure configure);

    public abstract Logger getLogger(Object object);

}
