package shepherd.api.config;

public interface ConfigChangeListener {

    void onConfigChanged(ConfigurationKey key, Object old, Object newValue);
    void onConfigRemoved(ConfigurationKey key, Object removed);
    void onConfigDefined(ConfigurationKey key, Object defaultValue);
    void onConfigSet(ConfigurationKey key, Object set);
}
