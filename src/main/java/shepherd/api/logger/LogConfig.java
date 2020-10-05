package shepherd.api.logger;

import shepherd.core.implement.assertion.Assertion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class LogConfig {

    public final static LogConfig.Builder newConfig()
    {
        return new Builder();
    }

    public final static class Builder{


        private final List<Logger.LogLevel> levels;
        private String name;

        private Builder()
        {
            levels = new ArrayList<>();
        }


        public synchronized Builder addLevel(Logger.LogLevel level)
        {
            Assertion.ifNull("level can not be null" , level);
            if(!levels.contains(level))
                levels.add(level);

            return this;
        }

        public synchronized Builder setName(String name)
        {
            this.name = name;

            return this;
        }


        public synchronized Builder addLevels(Logger.LogLevel ... levels)
        {
            for(Logger.LogLevel level:levels)
            {
                addLevel(level);
            }
            return this;
        }

        public synchronized Builder addLevels(Collection<Logger.LogLevel> levels)
        {
            for(Logger.LogLevel level:levels)
            {
                addLevel(level);
            }
            return this;
        }

        public synchronized LogConfig build()
        {
            return new LogConfig(
                    levels.toArray(new Logger.LogLevel[levels.size()]) ,
                    name
            );
        }

    }


    private final Logger.LogLevel[] levels;
    private final String name;

    private LogConfig(Logger.LogLevel[] levels, String name) {
        this.levels = levels;
        this.name = name;
    }

    public String name() {
        return name;
    }

    public Logger.LogLevel[] levels() {
        return levels;
    }
}
