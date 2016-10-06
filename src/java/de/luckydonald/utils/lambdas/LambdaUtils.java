package de.luckydonald.utils.lambdas;

import java.util.concurrent.Callable;

public class LambdaUtils {
    public static <T> T uncheckCall(Callable<T> callable) {
        // see http://stackoverflow.com/a/19757456/3423324
        try { return callable.call(); }
        catch (Exception e) { return sneakyThrow(e); }
    }
    public static void uncheckRun(RunnableExc r) {
        try { r.run(); } catch (Exception e) { sneakyThrow(e); }
    }
    public interface RunnableExc { void run() throws Exception; }


    public static <T> T sneakyThrow(Throwable e) {
        return LambdaUtils.<RuntimeException, T>sneakyThrow0(e);
    }
    private static <E extends Throwable, T> T sneakyThrow0(Throwable t) throws E { throw (E)t; }
}