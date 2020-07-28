package shepherd.api.config;

public interface Configuration {

    <T> boolean defineConfiguration(ConfigurationKey<T> configName, T defaultValue, ConfigurationChangeController controller);
    <T> ConfigurationChangeResult<T> set(ConfigurationKey<T> confKey, T value);
    <T> ConfigurationChangeResult<T> set(String config, T value);
    <T> T get(ConfigurationKey<T> confKey);
    <T> T get(ConfigurationKey<T> confKey, T defaultValue);
    <T> T get(String configName);
    <T> T get(String configName, T defualtValue);
    <T> boolean remove(ConfigurationKey<T> confKey);
    void addConfigChangeListener(ConfigChangeListener listener);
    void removeConfigChangeListener(ConfigChangeListener listener);
    Configuration createSubConfiguration(String name);
    Configuration subConfiguration(String name);
    String name();
    Configuration asUndefinableConfiguration();
}
