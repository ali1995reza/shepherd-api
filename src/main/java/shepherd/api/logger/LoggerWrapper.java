package shepherd.api.logger;

public class LoggerWrapper implements Logger {

    private Logger wrapped;
    private final Object loggerObject;

    public LoggerWrapper(Object loggerObject, Logger wrapped)
    {
        this.loggerObject = loggerObject;
        setWrapped(wrapped);
    }

    public LoggerWrapper(Object loggerObject)
    {
        this(loggerObject , NullLogger.DEFAULT);
    }

    public LoggerWrapper setWrapped(Logger wrapped) {

        this.wrapped = wrapped==null? NullLogger.DEFAULT:wrapped;

        return this;
    }


    public Logger wrapped() {
        return wrapped;
    }

    public Object loggerObject() {
        return loggerObject;
    }

    @Override
    public LogLevel[] logLevel() {
        return wrapped.logLevel();
    }

    @Override
    public boolean containsLevel(LogLevel level) {
        return wrapped.containsLevel(level);
    }

    @Override
    public String name() {
        return wrapped.name();
    }

    @Override
    public void debug(Object o) {
        wrapped.debug(o);
    }

    @Override
    public void debug(String str, Object... objects) {
        wrapped.debug(str , objects);
    }

    @Override
    public void information(Object o) {
        wrapped.information(o);
    }

    @Override
    public void information(String str, Object... objects) {
        wrapped.information(str, objects);
    }

    @Override
    public void error(Object o) {
        wrapped.error(o);
    }

    @Override
    public void error(String str, Object... objects) {
        wrapped.error(str , objects);
    }

    @Override
    public void error(Throwable e) {
        wrapped.error(e);
    }

    @Override
    public void error(String s, Throwable e) {
        wrapped.error(s , e);
    }

    @Override
    public void warning(Object o) {
        wrapped.warning(o);
    }

    @Override
    public void warning(String str, Object... objects) {
        wrapped.warning(str, objects);
    }

    @Override
    public void warning(Throwable e) {
        wrapped.warning(e);
    }

    @Override
    public void warning(String s, Throwable e) {
        wrapped.warning(s , e);
    }

    @Override
    public void exception(Object o) {
        wrapped.exception(o);
    }

    @Override
    public void exception(String str, Object... objects) {
        wrapped.exception(str, objects);
    }

    @Override
    public void exception(Throwable e) {
        wrapped.exception(e);
    }

    @Override
    public void exception(String s, Throwable e) {
        wrapped.exception(s , e);
    }
}
