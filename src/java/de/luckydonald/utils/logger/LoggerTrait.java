package de.luckydonald.utils.logger;

import java.util.logging.Logger;

public interface LoggerTrait {
    default Logger getLogger() {
        return Logger.getLogger(this.getClass().getCanonicalName());
    }
}
