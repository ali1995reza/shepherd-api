package shepherd.api.logger;


public interface Logger {

    enum LogLevel{
        DEBUG(1<<0) ,
        INFORMATION(1<<1),
        ERROR(1<<2),
        WARNING(1<<3),
        EXCEPTION(1<<4),
        STACK_TRACE(1<<5);


        final int code;

        LogLevel(int code) {
            this.code = code;
        }

        public int code() {
            return code;
        }

        public boolean is(LogLevel level)
        {
            return this==level;
        }

        public static int createLogLevelId(LogLevel ... levels)
        {
            int id = 0;
            for(LogLevel level:levels)
            {
                id |= level.code;
            }

            return id;
        }

        public static boolean contains(int code , LogLevel level){

            return (code&level.code) == level.code;
        }
    }

    public final static String ARG_TOKEN_REGX_STRING = "\\{\\}";



    LogLevel[] logLevel();


    boolean containsLevel(LogLevel level);

    String name();

    void debug(Object o);
    void debug(String str, Object... objects);
    void information(Object o);
    void information(String str, Object... objects);
    void error(Object o);
    void error(String str, Object... objects);
    void error(Throwable e);
    void error(String s, Throwable e);
    void warning(Object o);
    void warning(String str, Object... objects);
    void warning(Throwable e);
    void warning(String s, Throwable e);
    void exception(Object o);
    void exception(String str, Object... objects);
    void exception(Throwable e);
    void exception(String s, Throwable e);

}
