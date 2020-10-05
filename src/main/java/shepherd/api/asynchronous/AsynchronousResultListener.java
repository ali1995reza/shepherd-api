package shepherd.api.asynchronous;


import shepherd.api.message.MessageService;

/**
 * <p>
 *     This interface will be used to listening to an async task result
 * </p>
 *
 * @see MessageService
 * @param <T> Result type that will provided by async task
 */
public interface AsynchronousResultListener<T> {

    /**
     * <p>
     *     It just represent an empty shared listener that can be use for
     *     that type of tasks which the result is not important
     * </p>
     */
    AsynchronousResultListener EMPTY = new AsynchronousResultListener() {
        @Override
        public void onUpdated(Object result) {

        }

        @Override
        public void onCompleted(Object result) {

        }
    };

    /**
     * this method call when a new update of result is ready
     * for example when a new acknowledge received it will call again
     * @param result the result object
     */
    void onUpdated(T result);

    /**
     * this method call when task completed and last version of result provided
     * @param result the result object
     */
    void onCompleted(T result);
}
