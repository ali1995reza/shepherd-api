package shepherd.api.asynchronous;

public interface AsynchronousFutureListener<T , A> {

    void onUpdated(T result, A attachment);
    void onCompleted(T result, A attachment);
}
