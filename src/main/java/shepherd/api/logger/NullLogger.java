package shepherd.api.logger;

public final class NullLogger implements Logger {


    public final static NullLogger DEFAULT = new NullLogger();



    private NullLogger()
    {

    }


    @Override
    public LogLevel[] logLevel() {
        return new LogLevel[0];
    }

    @Override
    public boolean containsLevel(LogLevel level) {
        return false;
    }

    @Override
    public String name() {
        return "NULL LOGGER";
    }

    @Override
    public void debug(Object o) {

    }

    @Override
    public void debug(String str, Object... objects) {

    }

    @Override
    public void information(Object o) {
    }

    @Override
    public void information(String str, Object... objects) {
    }

    @Override
    public void error(Object o) {

    }

    @Override
    public void error(String str, Object... objects) {

    }

    @Override
    public void error(Throwable e) {

    }

    @Override
    public void error(String s, Throwable e) {

    }

    @Override
    public void warning(Object o) {

    }

    @Override
    public void warning(String str, Object... objects) {

    }

    @Override
    public void warning(Throwable e) {

    }

    @Override
    public void warning(String s, Throwable e) {

    }

    @Override
    public void exception(Object o) {

    }

    @Override
    public void exception(String str, Object... objects) {

    }

    @Override
    public void exception(Throwable e) {

    }

    @Override
    public void exception(String s, Throwable e) {

    }
}
