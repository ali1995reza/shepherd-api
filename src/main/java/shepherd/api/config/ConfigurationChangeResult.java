package shepherd.api.config;

public interface ConfigurationChangeResult<T> {


    boolean success();
    String error();
    T newValue();

}
