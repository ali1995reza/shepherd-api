package shepherd.api.logger;

public final class NullLoggerFactory extends ShepherdLoggerFactory {

    public final static NullLoggerFactory DEFAULT = new NullLoggerFactory();


    private NullLoggerFactory()
    {

    }


    @Override
    public Logger getLogger(Object object) {
        return NullLogger.DEFAULT;
    }
}
