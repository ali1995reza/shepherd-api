package shepherd.api.config;

import java.util.regex.Pattern;

public final class ConfigurationKey<T> {

    private final static String CONFIG_PATTERN_STR = "([A-Za-z0-9_\\-\\.]*)";
    private final static Pattern PATTERN = Pattern.compile(CONFIG_PATTERN_STR);

    private final static void validateConfigName(String name)
    {
        if(name==null)throw new NullPointerException("config name can not be null");

        if(!PATTERN.matcher(name).matches())
        {
            throw new IllegalStateException("config name invalid - valid pattern : "+CONFIG_PATTERN_STR);
        }
    }

    private final String name;

    public ConfigurationKey(String name)
    {
        validateConfigName(name);
        this.name = name;
    }

    public String name(){
        return name;
    }

    @Override
    public String toString() {
        return "Configuration Key : "+name;
    }
}

