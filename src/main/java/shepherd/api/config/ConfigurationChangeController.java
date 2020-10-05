package shepherd.api.config;

public interface ConfigurationChangeController {


    ConfigurationChangeResult approveChange(IConfiguration config,
                                            ConfigurationKey confName,
                                            Object oldVal,
                                            Object newVal);
}
