package javatest;

import java.util.concurrent.CompletableFuture;

/**
 * <p>
 *  The {@link CompletableFuture} test
 * </p>
 *
 * @author qishisong
 * @since 2019/12/30 11:08 上午
 */
public class CompletableFutureTest {
    public static void main(String[] args) throws Exception{
        CompletableFuture<String> future = CompletableFuture.completedFuture("result");
        String s = future.get();
        System.out.println(s);

    }
}
