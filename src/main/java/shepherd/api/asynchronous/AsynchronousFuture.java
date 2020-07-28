package shepherd.api.asynchronous;

import java.util.concurrent.TimeUnit;

public interface AsynchronousFuture<T> {

    boolean cancel();

    <A> AsynchronousFuture<T> setListener(AsynchronousFutureListener<T, A> listener);

    T await() throws InterruptedException;

    T awaitUninterruptibly();

    T await(int timeOut, TimeUnit timeUnit) throws InterruptedException;
    T await(int timeOut) throws InterruptedException;

    AsynchronousFuture<T> attach(Object o);
    <D> D attachment();
}
