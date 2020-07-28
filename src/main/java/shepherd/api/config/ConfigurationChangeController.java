package shepherd.api.config;

public interface ConfigurationChangeController {


    ConfigurationChangeResult approveChange(ConfigurationKey confName, Object oldVal, Object newVal);
}
