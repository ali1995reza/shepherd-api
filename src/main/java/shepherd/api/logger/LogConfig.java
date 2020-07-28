package shepherd.api.logger;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static shepherd.api.logger.Logger.LogLevel.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface LogConfig {

    Logger.LogLevel[] loglevel() default {INFORMATION , ERROR , EXCEPTION};
    String loggerName() default "";
}
