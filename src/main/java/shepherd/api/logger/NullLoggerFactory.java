package shepherd.api.logger;

public final class NullLoggerFactory extends LoggerFactory {

    public final static NullLoggerFactory DEFAULT = new NullLoggerFactory();


    private NullLoggerFactory()
    {

    }


    @Override
    public LoggerFactory setLoggerConfigure(LoggerConfigure configure) {
        return this;
    }

    @Override
    public Logger getLogger(Object object) {
        return NullLogger.DEFAULT;
    }
}
