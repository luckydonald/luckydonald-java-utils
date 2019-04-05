package de.luckydonald.utils.lambdas;

import java.util.concurrent.Callable;

public class LambdaUtils {
    /**
     * Use methods throwing errors.
     *
     * <br><br>
     * <b>Example:</b><br>
     * We have a stream of <code>obj</code> elements, and wanna call <code>obj.someCall()</code> basically,
     * but we don't want to keep them elements if that method thrown an error.
     * <pre>return stream.filter(obj -&gt; uncheckCall(obj::someCall))</pre>
     *
     * @param callable  A lambda to execute.
     * @param <T>  The return type of the lambda.
     * @return  Returns what the lambda returns.
     *
     * @link https://stackoverflow.com/a/19757456/3423324#java-8-lambda-streams-filter-by-method-with-exception
     */
    public static <T> T uncheckCall(Callable<T> callable) {
        // see http://stackoverflow.com/a/19757456/3423324#java-8-lambda-streams-filter-by-method-with-exception
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