package shepherd.api.logger;

import java.util.HashMap;
import java.util.Map;

public class LoggerFactoryWrapper extends LoggerFactory {


    private LoggerFactory wrapped;
    private final Map<Object, LoggerWrapper> createdLoggers;

    public LoggerFactoryWrapper(LoggerFactory wrapped)
    {
        createdLoggers = new HashMap<>();
        setWrapped(wrapped);
    }

    public LoggerFactoryWrapper()
    {
        this(NullLoggerFactory.DEFAULT);
    }

    public LoggerFactoryWrapper setWrapped(LoggerFactory wrapped) {
        synchronized (createdLoggers) {
            this.wrapped = wrapped==null? NullLoggerFactory.DEFAULT:wrapped;
            for(LoggerWrapper wrapper:createdLoggers.values())
            {
                wrapper.setWrapped(this.wrapped.getLogger(wrapper.loggerObject()));
            }
            return this;
        }
    }

    @Override
    public LoggerFactory setLoggerConfigure(LoggerConfigure configure) {
        synchronized (createdLoggers)
        {
            this.wrapped.setLoggerConfigure(configure);
            return this;
        }
    }

    @Override
    public Logger getLogger(Object object) {

        synchronized (createdLoggers) {
            if(createdLoggers.containsKey(object))
            {
                return createdLoggers.get(object);
            }else
            {
                LoggerWrapper wrapper = new LoggerWrapper(object ,
                        wrapped.getLogger(object));
                createdLoggers.put(object , wrapper);

                return wrapper;
            }
        }
    }
}
