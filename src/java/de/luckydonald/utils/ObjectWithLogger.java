package de.luckydonald.utils;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @deprecated Use <code>de.luckydonald.utils.logger.ObjectWithLogger</code> instead.
 * @see de.luckydonald.utils.logger.ObjectWithLogger
 */
@Deprecated
class ObjectWithLogger extends de.luckydonald.utils.logger.ObjectWithLogger {
    private static void logDeprecationNotice(Logger l) {
        l.warning("Using `de.luckydonald.utils.ObjectWithLogger` is deprecated, please use `de.luckydonald.utils.logger.ObjectWithLogger` instead. That's a '.logger' more.");
    }

    /**
     * @deprecated Use <code>de.luckydonald.utils.logger.ObjectWithLogger</code> instead.
     * @see de.luckydonald.utils.logger.ObjectWithLogger  Use this instead.
     */
    @Override
    @Deprecated
    public Logger getLogger() {
        Logger l = super.getLogger();
        logDeprecationNotice(l);
        return l;
    }

    /**
     * @deprecated Use <code>de.luckydonald.utils.logger.ObjectWithLogger</code> instead.
     * @see de.luckydonald.utils.logger.ObjectWithLogger  Use this instead.
     */
    @Deprecated
    public static Logger getStaticLogger() {
        Logger l = de.luckydonald.utils.logger.ObjectWithLogger.getStaticLogger();
        logDeprecationNotice(l);
        return l;
    }

    /**
     * @deprecated Use <code>de.luckydonald.utils.logger.ObjectWithLogger</code> instead.
     * @see de.luckydonald.utils.logger.ObjectWithLogger  Use this instead.
     */
    @Override
    @Deprecated
    public Handler addLogConsoleHandler(Level l) {
        Logger log = de.luckydonald.utils.logger.ObjectWithLogger.getStaticLogger();
        logDeprecationNotice(log);
        return super.addLogConsoleHandler(l);
    }
}